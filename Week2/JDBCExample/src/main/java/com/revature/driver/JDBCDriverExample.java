package com.revature.driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnectionUtil;

public class JDBCDriverExample {

	public static void main(String[] args) {
		
		try {
			Connection conn = ConnectionUtil.getConnection();
			String sql = "select * from \"Artist\"";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
