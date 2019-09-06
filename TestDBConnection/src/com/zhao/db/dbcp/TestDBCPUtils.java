package com.zhao.db.dbcp;

import java.sql.Connection;

public class TestDBCPUtils {
	
	public static void main(String[] args) throws Exception {
		Connection c = DBCPUtils.getConnection();
		System.out.println("connection sucessfully...");
	}
}
