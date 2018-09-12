package com.revature.driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnectionUtil;

public class JDBCDriverExample {

	public static void main(String[] args) {

		try {
			Connection conn = ConnectionUtil.getConnection();
			String sql = "{call change_employee(?, ?, ?)}";
			sql = "{call new_stored_proc(?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			/*
			 * cstmt.setInt(1, 40); cstmt.setString(2, "New");
			 * cstmt.setString(3, "Emp"); cstmt.executeUpdate();
			 */
			cstmt.registerOutParameter(1, java.sql.Types.BIGINT);
			cstmt.executeUpdate();
			System.out.println("Count:" + cstmt.getLong(1));

			conn.setAutoCommit(false);
			sql = "{call get_emps_pg(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 10);
			ResultSet rs = cstmt.executeQuery();
			rs.next();
			//System.out.println(rs.getObject(1));
			Object rs2 = rs.getObject(1);
			if (rs2 instanceof ResultSet) {
				System.out.println("Works!!");
				while (((ResultSet)rs2).next()) {
					System.out.println("Name: " + ((ResultSet)rs2).getString(2));
				}
			}
			else {
				System.out.println("No");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
