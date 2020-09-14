package com.bit.sts02.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts02.model.entity.EmpVo;

public interface EmpDao {

	List<EmpVo> selectAll() throws SQLException;

}