package com.springboot.web.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.viewmodel.TestModel;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

	@RequestMapping("/")
	public String index(){
		return "Hello test";
	}
	
	@RequestMapping("/getlist")
	public List<TestModel> list(){
		
		List<TestModel> result=new ArrayList<>();
		
		result.add(new TestModel(1,"benny",Long.parseLong("1536671783296")));
		result.add(new TestModel(2,"tom",Long.parseLong("1526671783273")));
		result.add(new TestModel(3,"janny",Long.parseLong("1535671783291")));
		result.add(new TestModel(4,"yang",Long.parseLong("1536641783293")));
		result.add(new TestModel(5,"win",Long.parseLong("1536671383226")));
		
		
		return result;
	}
	
	
	@RequestMapping("/error")
	public int error(){
		return 100/0;
	}
	
	
	
}
