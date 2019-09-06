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
			//InputStream is = DBCPUtils.class.getResourceAsStream("c3p0.properies");//配置文件和类放在一起
			InputStream is = DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");//src(bin)的根目录---classpath的根
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