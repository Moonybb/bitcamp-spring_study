package com.bit.sts03.dept.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.sts03.dept.model.entity.Dept03Vo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Dept03DaoTest {
	static Dept03Vo target = new Dept03Vo(1,"test","test");
	Dept03Dao dept03Dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass........테스트 케이스를 실행 전(수행단위)");
		
//		String sql = "CREATE TABLE IF NOT EXISTS `dept03` (" + 
		String sql = "CREATE TABLE `dept03` (" + 
	            "   `deptno` INT(11) NOT NULL AUTO_INCREMENT," + 
	            "   `dname` VARCHAR(10) NULL DEFAULT NULL," + 
	            "   `loc` VARCHAR(10) NULL DEFAULT NULL," + 
	            "   PRIMARY KEY (`deptno`)" + 
	            ")";
				
		ApplicationContext ac=null;
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		DataSource dataSource = (DataSource) ac.getBean("dataSource");
		Connection conn = dataSource.getConnection();
		/* create table */
		conn.prepareStatement(sql).execute();
		/* insert dummy data */
//		conn.prepareStatement("insert into dept03 (dname, loc) values ('"+target.getDname()+"','"+target.getLoc()+"')").executeUpdate();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass........테스트 케이스 실행 후(수행단위)");
		File file1 = new File("/Users/moony/data/xeTest.mv.db");
		File file2 = new File("/Users/moony/data/xeTest.trace.db");
		
		if(file1.exists()) file1.deleteOnExit();
		if(file2.exists()) file2.deleteOnExit();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp........테스트 어노테이션이 붙은 각 테스트 시행 전");
		ApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		dept03Dao = (Dept03Dao) ac.getBean("dept03Dao");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown........테스트 어노테이션이 붙은 각 테스트 시행 후");
	}

	@Test
	public void testSelectAll() throws SQLException {
		System.out.println("testSelectAll...");
		assertSame(1, dept03Dao.selectAll().size());
	}
	
	@Test
	public void testSelectOne() throws SQLException {
		System.out.println("testSelectOne...");
		assertEquals(target, dept03Dao.selectOne(target.getDeptno()));
	}
	
	@Test
	public void testInsertOne() {
		try {
			dept03Dao.insertOne(target);
			assertTrue(true);
		}catch(SQLException e){
			assertFalse(true);
		}
	}

	@Test
	public void testUpdate() throws SQLException {
//		target = new Dept03Vo(target.getDeptno(),"test1","test2");
		target.setDname("test1");
		target.setLoc("test2");
		assertSame(1, dept03Dao.updateOne(target));
	}
	
	@Test
	public void testZDeleteOne() throws SQLException {
		assertSame(1, dept03Dao.zDeleteOne(target.getDeptno()));
	}
}
