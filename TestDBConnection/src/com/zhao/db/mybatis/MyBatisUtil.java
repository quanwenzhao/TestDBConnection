package com.zhao.db.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory = null;
	public static SqlSessionFactory getSqlSessionFactory() {
		InputStream inputStream = null;
		if(sqlSessionFactory==null) {
			try {
				String resource = "mybatis-config.xml";
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				return sqlSessionFactory;
			}catch(IOException ex) {
				System.err.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
}
