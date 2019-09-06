package com.zhao.db.mybatis;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class TestSqlSessionFactoryUtil {

	public static void main(String[] args) throws IOException{
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			System.out.println("sqlSession open sucessfully...");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
			sqlSession.rollback();
		}finally {
			if(sqlSession!=null) {
				sqlSession.close();
			}
		}
	}
}
