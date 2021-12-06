package lab_sheet.Lab_10;

import java.sql.*;
import java.util.Scanner;

class database {
    Connection con = null;
    Statement stmt = null;
    Statement stmt1 = null;

    public void display_db() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "select * from books order by id";

            ResultSet res = stmt1.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String title = res.getString(2);
                String author = res.getString(3);
                float price = res.getFloat(4);
                int qty = res.getInt(5);
                System.out.println("id : " + id + " Title : " + title + "   Author : " + author + "    Price : " + price
                        + "    qty : " + qty);
                System.out.println();

            }

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
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "update books set price = " + custom_price + "where id = " + user_id + ";";

            ResultSet res = stmt1.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String title = res.getString(2);
                String author = res.getString(3);
                float price = res.getFloat(4);
                int qty = res.getInt(5);
                System.out.println("id : " + id + " Title : " + title + "   Author : " + author + "    Price : " + price
                        + "    qty : " + qty);
                System.out.println();

            }

            stmt.close();
        } catch (Exception es) {

        }
    }

    public void search_db(int max, int min) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "select * from books where price>=" + min + " and price <=" + max + ";";

            ResultSet res = stmt1.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String title = res.getString(2);
                String author = res.getString(3);
                float price = res.getFloat(4);
                int qty = res.getInt(5);
                System.out.println("id : " + id + " Title : " + title + "   Author : " + author + "    Price : " + price
                        + "    qty : " + qty);
                System.out.println();

            }

            stmt.close();

        } catch (Exception es) {
            System.out.println(es.getMessage());

        }
    }

    public void delete_db(int user_id) {
        int k = 0;
        try {

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "delete from books where id = " + user_id + ";";

            ResultSet res = stmt1.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt(1);
                String title = res.getString(2);
                String author = res.getString(3);
                float price = res.getFloat(4);
                int qty = res.getInt(5);
                System.out.println("id : " + id + " Title : " + title + "   Author : " + author + "    Price : " + price
                        + "    qty : " + qty);
                System.out.println();

            }
            res.close();
            stmt.close();

        } catch (Exception es) {
            System.out.println("There is an error");
            k = 1;

        } finally {
            if (k == 0) {
                System.out.println("Deleted Successfully ");
            }

        }
    }

    public void insert_db(int id, String title, String author, float price, int qty) {
        int k = 0;
        try {

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
                    "admin");
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            String sql = "insert into books values (" + id + ",'" + title + "'" + ",'" + author + "'"
                    + "," + price + "," + qty + ");";

            stmt1.executeQuery(sql);
            stmt.close();

        } catch (Exception es) {
            System.out.println(es.getMessage());

            System.out.println("There is an error");
            k = 1;

        } finally {
            if (k == 0) {
                System.out.println("Deleted Successfully ");
            }

        }
    }

    public void menu_list() {
        System.out.println("/////Meanu/////");
        System.out.println("1.Display the rows in the table");
        System.out.println("2.Update the price");
        System.out.println("3.Search for the books");
        System.out.println("4.Delete the Books");
        System.out.println("5.Insert a new book");
        System.out.println("6.Exit");
        System.out.print("Enter your choice : ");

    }

}

public class jdbcQ1 {

    public static void main(String[] args) {
        database db1 = new database();
        Scanner input = new Scanner(System.in);

        db1.menu_list();
        int key = input.nextInt();
        switch (key) {
            case 1:
                db1.display_db();
                System.out.println("Display");
                break;
            case 2:
                System.out.println("update");
                System.out.print("Enter the price : ");
                float price = input.nextFloat();
                System.out.print("Enter the id : ");
                int user_id = input.nextInt();
                db1.update_db(price, user_id);
                break;
            case 3:
                System.out.println("search");
                System.out.print("Enter the min price : ");
                int min_price = input.nextInt();
                System.out.print("Enter the max price : ");
                int max_price = input.nextInt();
                db1.search_db(max_price, min_price);

                break;
            case 4:
                System.out.println("Delete ");
                System.out.print("Enter the id : ");
                int user_id1 = input.nextInt();
                db1.delete_db(user_id1);
                break;
            case 5:
                System.out.println("Insert");
                System.out.print("Enter the Id :");
                int id1 = input.nextInt();
                System.out.print("Enter the name : ");
                String name1 = input.next();
                System.out.println("Enter the author : ");
                String author1 = input.next();
                System.out.print("Enter the price : ");
                float price1 = input.nextFloat();
                System.out.print("Enter the Quantity : ");
                int qty1 = input.nextInt();
                db1.insert_db(id1, name1, author1, price1, qty1);
                db1.display_db();

                break;
            case 6:
                System.out.println("Thank you :)");
                System.exit(0);
                break;

        }
        input.close();

    }

}
