package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException{
		String url = "jdbc:postgresql://rev1808java-nick-db2.cjteoptiiwyx.ca-central-1.rds.amazonaws.com:5432/postgres1808?";
		String user = "njurczak";
		String pass = "Revature";
		
		return DriverManager.getConnection(url, user, pass);
	}
}
