package com.springboot.web.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  配置站点信息类
 * @author Benny
 *
 */

@ConfigurationProperties(prefix="custom")
public class ConfigSiteBean {

	private String title;	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String keyword;	
	private String description;
	
}
