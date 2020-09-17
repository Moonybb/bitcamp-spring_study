package com.bit.sts05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.sts05.dept.model.DeptDao;

// dao생성 -> service생성 -> controller객체 생성 순이어야 오토와이어를 통해 주입이 가능하다.
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptDao deptDao;
	
	@Override
	public void list(Model model) {
		model.addAttribute("list",deptDao.selectAll());
	}
}
