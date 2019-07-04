package com.yxy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import com.yxy.demo.entityx.Student;
import com.yxy.demo.service.StudentService;

//配置类  等价于 配置文件
@Configuration
public class AppConfig {
		@Bean
		public StudentService stuService() {//<bean id ="xxxxxxx">  方法名
			StudentService studentService = new StudentService();
			
			//现在的做法  效果都是一样的
			//studentDao stuDao = new studentDao();
			//studentService.setStudentDao(stuDao);
			return studentService; //返回值<bean class ="xxxxxxx">
			
		}
}
