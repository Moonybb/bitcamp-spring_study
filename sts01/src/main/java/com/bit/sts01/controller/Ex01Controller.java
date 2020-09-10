package com.bit.sts01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * POJO 오래된 방식의 간단한 자바 오브젝트
 * */
@Controller
public class Ex01Controller{
	
	@RequestMapping("/ex01.bit")
	public ModelAndView handleRequest(){
		
		return new ModelAndView("ex01");
	}
	
}