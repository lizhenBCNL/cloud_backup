package com.arkcloud.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

import com.arkcloud.common.Constans;

/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
@Component
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResultData {
	private int result = 200;
	private String message = Constans.MESS_SUCCESS;
	private Object data;

	public ResultData() {
		super();
	}

	public ResultData(int result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public ResultData(int result, String message, Object data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void clear() {
		data = null;
	}

	@Override
	public String toString() {
		return "ResultData [result=" + result + ", message=" + message + ", data=" + data + "]";
	}
}
