package com.yxy.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Test {
@RequestMapping("helloWorld")
@ResponseBody
	public 	String helloword() {
		return "hello";
	}
@RequestMapping("myhello")
@ResponseBody
	public 	String myhello() {
		return "hello2222";
	}
}
