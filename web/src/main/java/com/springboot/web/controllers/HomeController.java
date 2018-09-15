package com.springboot.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.core.ConfigSiteBean;
import com.springboot.web.core.SqlConfigBean;

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
	
	/*@Autowired
	SqlConfigBean configSql;*/

	@RequestMapping("/")
	public String index(){
		Test();
		return "Hello world "+configSite.getDescription();
	}
	
	public void Test(){    	
    	/*System.out.println(configSql.getUid());*/
    }

}
