package project;

import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;

import lab_sheet.Lab_10.jdbcQ1;
import net.proteanit.sql.DbUtils;

public class JDBC_table_printer {
    Connection con = null;
    Statement stmt = null;
    Statement stmt1 = null;

    public void print_table(String tablename, String databasename, JTable table) {

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
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

    public void update_db(Float custom_price, int user_id) {

        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "update books set price = " + custom_price + "where id = " + user_id + ";";

            int a = stmt.executeUpdate(sql);
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "The book has been updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Something Went Wrong..", "Error as Title",
                        JOptionPane.ERROR_MESSAGE);
            }

            stmt.close();
        } catch (SQLException sqe) {

        }
    }

    void update_box() {
        JTextField id = new JTextField();
        JTextField price = new JTextField();
        Object[] message = {
                "Id :", id,
                "Update price :", price
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Update", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            update_db(Float.valueOf(price.getText()), Integer.valueOf(id.getText()));
        } else {
            System.out.println("Login canceled");
        }
    }

    public void delete_box(String tablename, JTable table, String database, String id_name) {
        JTextField id = new JTextField();
        Object[] message = {
                "Id :", id
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Delete Box", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            delete_tuple(id_name + " = '" + id.getText() + "'", tablename, table, database);
        } else {
            System.out.println("Login canceled");
        }
    }

    public void delete_tuple(String condition, String tablename, JTable table, String database) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, "postgres",
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

    public void insert_tuple(String values, String tablename, JTable table, String database) {
        Connection con = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "insert into " + tablename + "  values(" + values + ") ;";
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

    public void print_specific_attribute_table(String tablename, String databasename, JTable table, String client_id,
            String columnName) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            // String sql1 = "delete from Store where username = 'anjana;";
            String sql = "select " + columnName + " from " + tablename + " where client_id = " + client_id + ";";
            // Select id, fname , city from client;

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

    float med_price_collector;
    String med_id_collector;

    public void med_price(String database, String med_name) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, "postgres",
                    "admin");
            stmt = con.createStatement();
            String sql = "select price,medicine_id from medicine_inventory where medicine_name = '" + med_name + "';";
            ResultSet res = stmt.executeQuery(sql);
            if (res.next()) {
                med_price_collector = res.getFloat(1);
                med_id_collector = res.getString(2);
            }

            stmt.close();
            if (con != null) {
                System.out.println("Connected");
            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    public String med_collect[] = new String[100];
    int k = 0;

    public void med_names(String database) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, "postgres",
                    "admin");
            stmt = con.createStatement();
            String sql = "select medicine_name from medicine_inventory;";
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                med_collect[k] = res.getString(1);
                k++;
            }
            for (int i = 0; i < 4; i++) {
                System.out.println(med_collect[i]);

            }
            stmt.close();
            if (con != null) {
                System.out.println("Connected");
            }

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }

    }

    void addorder(String databasename, String order_id, String client_id, String med_id, String med_name, String qty,
            String date, String amount) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
                    "admin");
            stmt = con.createStatement();
            String sql = "insert into orders values(" + order_id + "," + client_id + "," + med_id + "," + "'" + med_name
                    + "',"
                    + qty
                    + ","
                    + date + "," + amount + ");";
            stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        JDBC_table_printer ob1 = new JDBC_table_printer();
        ob1.med_names("mypharma");
        for (int i = 0; i < 4; i++) {
            System.out.println(ob1.med_collect[i]);

        }

    }

}
