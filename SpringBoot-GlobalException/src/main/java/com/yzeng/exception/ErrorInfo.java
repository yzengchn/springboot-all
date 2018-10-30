package com.yzeng.exception;

/**
 * 全局异常处理信息
 * code：消息类型，
 * message：消息内容，
 * url：请求的url，
 * data：请求返回的数据
 * @author Yao.Zeng
 *
 */

public class ErrorInfo<T> {
	
	public static final Integer OK = 0;
	public static final Integer ERROR = -1;
	
	private Integer code;
	private String msg;
	private String url;
	private T data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
