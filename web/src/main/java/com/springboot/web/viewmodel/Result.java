package com.springboot.web.viewmodel;

public class Result extends ResultBase<String> {
	
	
	public Result() {}
	
	public Result(boolean bool,String data,String msg) {
		this.setBool(bool);
		this.setData(data);
		this.setMsg(msg);
	}
	
}
