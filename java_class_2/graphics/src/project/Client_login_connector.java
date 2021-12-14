package project;

import java.sql.*;

public class Client_login_connector {
    boolean checker;
    String id;

    public void regsql(int client_id, String usrnam, String password, String client_address, String client_name,
            String client_email, String mobilephone) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/mypharma";
        String username = "postgres";
        String password1 = "admin";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password1);
            PreparedStatement s1 = connection.prepareStatement("select count(client_id) AS rowcount from client");
            ResultSet rs = s1.executeQuery();
            rs.next();
            client_id = client_id + rs.getInt("rowcount");

            String s = "INSERT into  client values (" + client_id + "," + "'" + usrnam + "'" + "," + "'" + password
                    + "'" + "," + "'" + client_address + "'" + "," + "'" + client_name + "'" + "," + "'" + client_email
                    + "'" + ","
                    + "'" + mobilephone + "'" + ");";
            PreparedStatement ps2 = connection.prepareStatement(s);
            ps2.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void linker(String name, String pass, String tablename, String data_base) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + data_base, "postgres",
                    "admin");
            stmt = con.createStatement();
            String sql = "select * from " + tablename + " where username = '" + name + "' and password = '" + pass
                    + "' ;";
            ResultSet res = stmt.executeQuery(sql);
            if (res.next()) {
                System.out.println("Yeah");
                checker = true;
                id = res.getString(1);

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
