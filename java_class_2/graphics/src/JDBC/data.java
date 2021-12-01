package JDBC;

import java.sql.*;

public class data {
    public static void main(String[] args) {
        Connection connect = null;
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "Gautam3377");

            if (connect != null) {
                System.out.println("Connected");

            } else {
                System.out.println("oobi");

            }
            connect.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hi");

        }

    }
}
