package Jdbc;

// Insert Record Using PreparedStatement

import java.sql.*;

public class Lecture7 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "insert into T1 values (?,?,?);";
            PreparedStatement p = con.prepareStatement(query);

            p.setInt(1,980);
            p.setString(2,"Prince");
            p.setString(3,"Pune");

             int affectedRow  = p.executeUpdate();
            System.out.println("Record inserted " + affectedRow);

            p.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
