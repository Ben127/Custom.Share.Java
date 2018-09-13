package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.springboot.web.core.ConfigSiteBean;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableConfigurationProperties({ConfigSiteBean.class})
public class application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(application.class, args);
    	
        System.out.println( "【启动成功】>>>>>    start ....." );
    }
}
