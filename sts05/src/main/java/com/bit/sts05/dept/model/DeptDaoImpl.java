package com.bit.sts05.dept.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.bit.sts05.dept.model.entity.DeptVo;

//@Repository
public class DeptDaoImpl extends SqlSessionDaoSupport implements DeptDao {
	
//	@Autowired
//	SqlSession sqlSession;
	
	public DeptDaoImpl() {
		System.out.println("dao create");
	}
	
	@Override
	public List<DeptVo> selectAll(){
		return getSqlSession().selectList("dept.selectAll");
	}

	@Override
	public List<DeptVo> selectAll(int begin){
		return getSqlSession().selectList("dept.selectAll",begin);
		
	}
	
}
