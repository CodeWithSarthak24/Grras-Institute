package Jdbc;

import java.sql.*;

// executeUpdate() — DELETE

public class Lecture4 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();
            String query = "delete from T1 where id = 786;";

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
