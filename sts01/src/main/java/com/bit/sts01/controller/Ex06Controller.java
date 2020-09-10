package com.bit.sts01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex06Controller {

	@RequestMapping("/ex07/*")
	public String ex01() {
		return "ex07";
	}
	
	@RequestMapping("/ex07")
	public String ex02() {
		return "ex07";
	}
}
