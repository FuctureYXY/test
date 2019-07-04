package com.yxy.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.yxy.demo.entityx.Student;
import com.yxy.demo.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Autowired
	private Student student;
	@Autowired
	ApplicationContext context ;//spring ioc容器
	@Test
	public void contextLoads() {
		System.out.println(student);
	}
	
/*	@Test
	public void  test() {
		StudentService bean = (StudentService)context.getBean("studentService"); 
		System.out.println(bean+"============");
	}*/
	@Test
	public void  test() {
		StudentService bean = (StudentService)context.getBean("stuService"); 
		System.out.println(bean+"============");
	}
	@Test
	public void  testLog() {//日志级别
		logger.trace("trace******");
		logger.debug("debug******");
		logger.info("Info******");
		logger.warn("warn******");
		logger.error("error*****");
	}
}

