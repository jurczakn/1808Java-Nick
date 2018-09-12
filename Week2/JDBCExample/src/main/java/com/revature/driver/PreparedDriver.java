package com.revature.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.util.ConnectionUtil;

public class PreparedDriver {

	public static void main(String[] args) {
		System.out.println("What is your last name?");
		Scanner s = new Scanner(System.in);
		String lname = s.nextLine();
		System.out.println("What is your new first name?");
		String fname = s.nextLine();
		try {
			Connection conn = ConnectionUtil.getConnection();
			/*Statement stmt = conn.createStatement();
			String sql = "update \"Employee\" set \"FirstName\" = '" + fname + "' where \"LastName\" = '" + lname +"'";
			stmt.executeUpdate(sql);*/
			String sql = "update \"Employee\" set \"FirstName\" = ? where \"LastName\" = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
