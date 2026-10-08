package Jdbc;

import java.sql.*;

// Delete Record Using PreparedStatement

public class Lecture9 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "delete from T1 where Id = ?;";
            PreparedStatement p = con.prepareStatement(query);

            p.setInt(1,980);

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
