package com.yxy.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
//@ImportResource(locations= {"classpath:spring.xml"})

@SpringBootApplication
public class DemoApplication { 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

