package com.springboot.web.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  SQL Server 配置信息
 *     Sql.properties
 * @author Benny
 *
 */

@Configuration
@ConfigurationProperties(prefix="sql")
@PropertySource("classpath:sql.properties")
public class SqlConfigBean {
	private String Server;
	public String getServer() {
		return Server;
	}
	public void setServer(String server) {
		Server = server;
	}
	public String getDatabase() {
		return Database;
	}
	public void setDatabase(String database) {
		Database = database;
	}
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	private String Database;
	private String Uid;
	private String Pwd;
}
