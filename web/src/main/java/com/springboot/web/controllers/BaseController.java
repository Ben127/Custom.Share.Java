package com.springboot.web.controllers;


import com.springboot.web.viewmodel.Result;

public class BaseController {

	/**
	 *  上传成功
	 * @param data
	 * @return
	 */
	public Object UploadSuccess(String data) {

		return new Result(true,data,"上传成功！");
	}
	
	/**
	 *  上传失败
	 * @param msg
	 * @return
	 */
	public Object UploadUnSuccess(String msg) {

		return new Result(false,null,msg);
	}
	
}
