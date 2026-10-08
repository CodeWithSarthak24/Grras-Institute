package Jdbc;

import java.sql.*;

// Update Record Using PreparedStatement

public class Lecture8 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "update T1 set Name = ? where Id = ?;";
            PreparedStatement p = con.prepareStatement(query);

            p.setString(1,"Albert");
            p.setInt(2,980);

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
