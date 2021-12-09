package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class tableexample {

  private JFrame frame;
  Connection con = null;
  Statement stmt = null;
  Statement stmt1 = null;
  Object[][] data;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          tableexample window = new tableexample();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public tableexample() {
    initialize();
  }

  public void delete_db(int user_id) {
    try {

      Class.forName("org.postgresql.Driver");
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
          "admin");
      stmt = con.createStatement();
      stmt1 = con.createStatement();
      String sql = "delete from books where id = " + user_id + ";";

      stmt1.executeQuery(sql);
      int a = stmt.executeUpdate(sql);
      if (a > 0) {
        JOptionPane.showMessageDialog(null, "The book has been deleted successfully");
      } else {
        JOptionPane.showMessageDialog(null, "Something Went Wrong..", "Error as Title", JOptionPane.ERROR_MESSAGE);
      }

    } catch (Exception es) {
      System.out.println("There is an error");

    }
  }

  public void insert_db(int id, String title, String author, float price, int qty) {
    try {

      Class.forName("org.postgresql.Driver");
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebookshop", "postgres",
          "admin");
      stmt = con.createStatement();
      stmt1 = con.createStatement();
      String sql = "insert into books values (" + id + ",'" + title + "'" + ",'" + author + "'"
          + "," + price + "," + qty + ");";

      int a = stmt.executeUpdate(sql);
      if (a > 0) {
        JOptionPane.showMessageDialog(null, "The book has been inserted successfully");
      } else {
        JOptionPane.showMessageDialog(null, "Something Went Wrong..", "Error as Title", JOptionPane.ERROR_MESSAGE);
      }
      stmt.close();

    } catch (Exception es) {
      System.out.println(es.getMessage());

      System.out.println("There is an error");

    }
  }

  public void display_db(DefaultTableModel tableModel) {
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
        Object[] data = { id, title, author, price, qty };
        tableModel.addRow(data);

      }

      stmt.close();
      if (con != null) {
        System.out.println("Connected");

      }

    } catch (Exception es) {
      System.out.println(es.getMessage());

    }
  }

  void delete_box() {
    String id = JOptionPane.showInputDialog("Enter the id:");
    delete_db(Integer.valueOf(id));

  }

  void inputer(DefaultTableModel tableModel) {
    JPanel p = new JPanel(new BorderLayout(5, 5));

    JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
    labels.add(new JLabel("Id", SwingConstants.TRAILING));
    labels.add(new JLabel("Title", SwingConstants.TRAILING));
    labels.add(new JLabel("Author", SwingConstants.TRAILING));
    labels.add(new JLabel("price", SwingConstants.TRAILING));
    labels.add(new JLabel("qty", SwingConstants.TRAILING));
    p.add(labels, BorderLayout.LINE_START);

    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
    JTextField id_val = new JTextField();
    JTextField Title_val = new JTextField();
    JTextField Author_val = new JTextField();
    JTextField Price_val = new JTextField();
    JTextField qty_val = new JTextField();
    controls.add(id_val);
    controls.add(Title_val);
    controls.add(Author_val);
    controls.add(Price_val);
    controls.add(qty_val);
    p.add(controls, BorderLayout.CENTER);
    input_box(frame, p, id_val, Title_val, Author_val, Price_val, qty_val, tableModel);
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
        JOptionPane.showMessageDialog(null, "Something Went Wrong..", "Error as Title", JOptionPane.ERROR_MESSAGE);
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

    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
      update_db(Float.valueOf(price.getText()), Integer.valueOf(id.getText()));
    } else {
      System.out.println("Login canceled");
    }
  }

  void input_box(JFrame frame, JPanel p, JTextField id_val,
      JTextField Title_val,
      JTextField Author_val,
      JTextField Price_val,
      JTextField qty_val, DefaultTableModel tableModel) {
    JOptionPane.showMessageDialog(
        frame, p, "Log In", JOptionPane.QUESTION_MESSAGE);
    if (id_val.getText().isEmpty() || Title_val.getText().isEmpty() || Author_val.getText().isEmpty()
        || Price_val.getText().isEmpty() || qty_val.getText().isEmpty()) {
      Object[] options = { "Try again", "Exite!" };
      int n = JOptionPane.showOptionDialog(frame, "Error Box", "Fill Every Box",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,
          options,
          options[0]);
      if (n == JOptionPane.YES_OPTION) {
        input_box(frame, p, id_val, Title_val, Author_val, Price_val, qty_val, tableModel);
      } else if (n == JOptionPane.NO_OPTION) {
      }

    } else {
      Object[] data = { id_val.getText(), Title_val.getText(), Author_val.getText(), Price_val.getText(),
          qty_val.getText() };
      insert_db(Integer.valueOf(id_val.getText()), Title_val.getText(), Author_val.getText(),
          Float.valueOf(Price_val.getText()), Integer.valueOf(qty_val.getText()));
      tableModel.addRow(data);

    }
  }

  void search_box(DefaultTableModel tableModel) {
    JTextField max = new JTextField();
    JTextField min = new JTextField();
    Object[] message = {
        "Max price :", max,
        "Min price :", min
    };

    int option = JOptionPane.showConfirmDialog(null, message, "Search Box", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
      for (int i = tableModel.getRowCount() - 1; i > -1; i--) {
        tableModel.removeRow(i);
      }
      search_db(Integer.valueOf(max.getText()), Integer.valueOf(min.getText()), tableModel);
    } else {
      System.out.println("Login canceled");
    }

  }

  public void search_db(int max, int min, DefaultTableModel tableModel) {
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
        Object[] data = { Integer.valueOf(id), title, author, Float.valueOf(price), Integer.valueOf(qty) };
        tableModel.addRow(data);

      }

      stmt.close();

    } catch (Exception es) {
      System.out.println(es.getMessage());

    }
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 677, 488);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(46, 43, 585, 292);
    frame.getContentPane().add(scrollPane);

    String[] column_values = { "Id", "Title", "author", "price", "qty" };
    DefaultTableModel tableModel = new DefaultTableModel(data, column_values);
    display_db(tableModel);
    JTable table = new JTable(tableModel);
    scrollPane.setViewportView(table);
    JButton btnNewButton = new JButton("Insert Row");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inputer(tableModel);
      }
    });
    btnNewButton.setBounds(58, 369, 83, 21);
    frame.getContentPane().add(btnNewButton);

    JButton btnNewButton_1 = new JButton("Delete");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        delete_box();
        for (int i = tableModel.getRowCount() - 1; i > -1; i--) {
          tableModel.removeRow(i);
        }
        display_db(tableModel);

      }
    });
    btnNewButton_1.setBounds(173, 369, 83, 21);
    frame.getContentPane().add(btnNewButton_1);

    JButton btnNewButton_2 = new JButton("update price");
    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        update_box();
        for (int i = tableModel.getRowCount() - 1; i > -1; i--) {
          tableModel.removeRow(i);
        }
        display_db(tableModel);

      }
    });
    btnNewButton_2.setBounds(285, 369, 117, 21);
    frame.getContentPane().add(btnNewButton_2);

    JButton btnNewButton_3 = new JButton("Display");
    btnNewButton_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (int i = tableModel.getRowCount() - 1; i > -1; i--) {
          tableModel.removeRow(i);
        }
        display_db(tableModel);
      }
    });
    btnNewButton_3.setBounds(426, 369, 83, 21);
    frame.getContentPane().add(btnNewButton_3);

    JButton btnNewButton_3_1 = new JButton("Search");
    btnNewButton_3_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        search_box(tableModel);
      }
    });
    btnNewButton_3_1.setBounds(530, 369, 83, 21);
    frame.getContentPane().add(btnNewButton_3_1);

    //

  }
}
