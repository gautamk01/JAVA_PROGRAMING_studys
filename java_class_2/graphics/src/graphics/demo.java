package graphics;

import java.sql.*;

public class demo {
    public static void main(String[] args) {
        String[] name = new String[3];
        int i = 0;

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres", "Gautam3377");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select* from login;");
            while (rs.next()) {
                name[i] = rs.getString("username");
                i++;
            }
            rs.close();
            stmt.close();
            c.close();

            System.out.println("Opened database successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}