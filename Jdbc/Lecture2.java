package Jdbc;

import java.sql.*;

// executeUpdate() — INSERT

public class Lecture2 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();
            String query = "insert into T1 values (786, 'Alex','Usa');";

            int affectedRow = st.executeUpdate(query);

            System.out.println(affectedRow + " row inserted");

            st.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
