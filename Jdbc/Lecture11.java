package Jdbc;

import java.sql.*;
import java.util.Scanner;

// Insert Records Using User Input

public class Lecture11 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "insert into T1 values(?,?,?)";
            PreparedStatement p = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Fill the information..........");

            System.out.println("Enter ID ");
            int Id = sc.nextInt();
            p.setInt(1,Id);

            sc.nextLine(); // consume leftover Enter
            // nextInt() reads the number but leaves the Enter key (\n).
            // So sc.nextLine() is used to consume that leftover Enter before reading the next text input.

            System.out.println("Enter Name ");
            String Name = sc.nextLine();
            p.setString(2,Name);

            System.out.println("Enter City ");
            String City = sc.nextLine();
            p.setString(3,City);

          int affectedRows = p.executeUpdate();
          System.out.println(affectedRows+" rows affected");

            p.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
