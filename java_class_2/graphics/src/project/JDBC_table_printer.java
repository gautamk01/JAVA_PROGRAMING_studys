package project;

import java.sql.*;

import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class JDBC_table_printer {

    public void print_table(String tablename, JTable table) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            // String sql1 = "delete from Store where store_username = 'Ram';";
            String sql = "select * from " + tablename + ";";

            ResultSet res = stmt1.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(res));

            stmt.close();
            if (con != null) {
                System.out.println("Connected");

            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    public void delete_tuple(String condition, String tablename, JTable table) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/help", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "delete from " + tablename + " Where " + condition + " ;";
            ResultSet res = stmt1.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(res));
            stmt.close();
            if (con != null) {
                System.out.println("Connected");
            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello world");

    }

}
