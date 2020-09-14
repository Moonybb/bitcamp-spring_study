package com.bit.sts02.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.sts02.model.entity.EmpVo;

public class EmpDao1Impl implements EmpDao {
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	RowMapper<EmpVo> rowMapper = new RowMapper<EmpVo>() {
		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmpVo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getInt(5));
		}
	};
	
	@Override
	public List<EmpVo> selectAll() throws SQLException{
		String sql = "select * from emp order by sabun";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	
}
