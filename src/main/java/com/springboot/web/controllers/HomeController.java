package com.springboot.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.core.ConfigSiteBean;

@RestController
@RequestMapping("/")
public class HomeController extends BaseController {
	
	@Value("${custom.description}")
	private String description;
	
	/**
	 *  注解配置属性
	 */
	@Autowired
	ConfigSiteBean configSite;

	@RequestMapping("/")
	public String index(){
		return "Hello world "+configSite.getDescription();
	}
	
	
}
