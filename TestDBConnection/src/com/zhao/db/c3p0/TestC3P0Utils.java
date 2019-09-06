package com.zhao.db.c3p0;

import java.sql.Connection;

public class TestC3P0Utils {
	
	public static void main(String[] args) throws Exception {
		Connection c = C3P0Utils.getConnection();
		System.out.println("connection sucessfully...");
	}
}
