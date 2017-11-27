package com.arkcloud.controller.exception;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.arkcloud.common.Constans;
import com.arkcloud.pojo.ResultData;
/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
	private static final Logger errorLog = Logger.getLogger("cb_common_error");

	private ResultData resultData = new ResultData();

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception ex) {
		if (ex instanceof CustomException) {
			if (ex.getMessage().indexOf("-") > 0) {
				String[] tmpEx = ex.getMessage().split("-");
				resultData.setMessage(tmpEx[0]);
				resultData.setResult(Integer.parseInt(tmpEx[1]));
				errorLog.info(Constans.ERR_LOG_PRE + new Date() + tmpEx[0]);
			} else if (ex instanceof RuntimeException) {
				resultData.setMessage(Constans.RUNTIME_EXCEPITON_ERR);
				resultData.setResult(500);
				errorLog.info(Constans.ERR_LOG_PRE + new Date() + Constans.RUNTIME_EXCEPITON_ERR);
			} else {
				resultData.setMessage(Constans.EXCEPTION_ERR);
				resultData.setResult(500);
				errorLog.info(Constans.ERR_LOG_PRE + new Date() + Constans.EXCEPTION_ERR);
			}
		}
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", resultData.getResult());
		map.put("message", resultData.getMessage());
		map.put("data", null);
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}

}
