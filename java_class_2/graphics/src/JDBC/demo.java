package JDBC;

import java.sql.*;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres", "Gautam3377");
			stmt = con.createStatement();
			System.out.print("Enter your user name : ");
			String uname = in.next();
			System.out.println("Enter your password : ");
			int pas = in.nextInt();
			String sql = "select * from login where username = '" + uname + "' and password =" + pas + ";";
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				System.out.println("Yeah");

			} else {
				System.out.println("oobi");

			}

			stmt.close();

			if (con != null) {
				System.out.println("Connected");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("hi");

		}

	}
}