package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	String url = "jdbc:mysql://localhost:3306/practice";
	private String username = "root";
	private String passowrd = "";
	private String sql = "select * from user where username=? and password=?";

	public boolean check(String uname, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection(url, username, passowrd);
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, uname);
				st.setString(2, pass);
				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					return true;
				}
			} catch (SQLException e) {
				System.out.println("Mysql Connection Error 2");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql Connection Error 1");
			e.printStackTrace();
		}

		return false;
	}
}
