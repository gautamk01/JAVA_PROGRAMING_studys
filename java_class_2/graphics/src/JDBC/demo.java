package JDBC;

import java.sql.*;

public class demo {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Gautam3377");
			if (con != null) {
				System.out.println("Connected");

			} else {
				System.out.println("oobi");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("hi");

		}

	}
}