package com.zhao.db.dbcp;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {

	private static DataSource dataSource;
	
	static {
		try {
			//InputStream is = DBCPUtils.class.getResourceAsStream("c3p0.properies");//�����ļ��������һ��
			InputStream is = DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");//src(bin)�ĸ�Ŀ¼---classpath�ĸ�
			Properties ps = new Properties();
			ps.load(is);
			dataSource = BasicDataSourceFactory.createDataSource(ps);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() throws SQLException{
		System.out.println("dataSource = "+dataSource);
		return dataSource.getConnection();
	}
}