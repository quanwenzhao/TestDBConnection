package com.zhao.db.mybatis;

import org.apache.ibatis.session.SqlSession;

public class TestMyBatisUtil {
	
	public static void main(String[] string) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
			System.out.println("sqlSession open sucessfully...");
		}finally {
			sqlSession.close();
		}
	}
}
