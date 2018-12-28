package com.jihn.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.activation.DataSource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class MySQLConnextionTest {
	private static final String DRIVER ="com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?serverTimezone=Asia/Seoul";
	private static final String USER = "zerock";
	private static final String PW ="zerock";	
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	}