package com.springboot.web.viewmodel;

import java.util.Date;

public class TestModel {
	
	
	public TestModel(){
		
	}
	
	public TestModel(int id,String name,long time){
		this.id=id;
		this.name=name;
		this.time=getTime(time);
	}
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	private String name;
	private Date time;
	
	
	
	private Date getTime(long time){
		Date date=new Date(time);
		return date;
	}
	
	
}
