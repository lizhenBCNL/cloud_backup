package com.arkcloud.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		// 实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		if (source != null && !source.trim().isEmpty()) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			try {
				// 转成直接返回
				return simpleDateFormat.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 如果参数绑定失败返回null
		return null;
	}

}
