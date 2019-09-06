package com.zhao.db.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	
	private static DataSource dataSource;
	
	static {
		dataSource = new ComboPooledDataSource("c3p0.xml");
	}

	public static DataSource getDataSource() {
		return dataSource;
	}

	public static Connection getConnection() throws SQLException{
		System.out.println("dataSource = "+dataSource);
		return dataSource.getConnection();
	}
}