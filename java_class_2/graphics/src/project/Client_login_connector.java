package project;

import java.sql.*;

public class Client_login_connector {
    boolean checker;

    public void linker(String name, int pass) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres", "Gautam3377");
            stmt = con.createStatement();
            String sql = "select * from login where username = '" + name + "' and password =" + pass + ";";
            ResultSet res = stmt.executeQuery(sql);
            if (res.next()) {
                System.out.println("Yeah");
                checker = true;

            } else {
                System.out.println("oobi");
                checker = false;

            }

            stmt.close();
            if (con != null) {
                System.out.println("Connected");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
