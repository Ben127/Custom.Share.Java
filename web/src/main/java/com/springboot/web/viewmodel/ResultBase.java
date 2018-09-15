package com.springboot.web.viewmodel;


public class ResultBase<T> {
	private boolean Bool;
	public boolean isBool() {
		return Bool;
	}
	public void setBool(boolean bool) {
		Bool = bool;
	}
	public T getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	private T Data;
	private String Msg;
	
}





