package com.bit.sts07.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.Model;

import com.bit.sts07.model.entity.EmpVo;

public interface EmpDao {

	List<EmpVo> selectAll() throws SQLException;
}
