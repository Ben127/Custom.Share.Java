package com.springboot.web.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *  全局异常 处理类
 * @author Benny
 *
 */
@ControllerAdvice
public class GlobalExceptionFilter {

	
	@ExceptionHandler(value = Exception.class)
	public void errorHandler(HttpServletRequest req, Exception ex){
		//打印异常信息：
		//ex.printStackTrace();
		
		
		System.out.println("发生了错误：>>>> "+ex.getMessage());
	}
	
}
