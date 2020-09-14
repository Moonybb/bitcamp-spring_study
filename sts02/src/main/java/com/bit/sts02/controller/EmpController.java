package com.bit.sts02.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts02.model.EmpDao;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping("list")
	public String list(Model model) throws SQLException{
		model.addAttribute("list", empDao.selectAll());
		return "empList";
	}
}
