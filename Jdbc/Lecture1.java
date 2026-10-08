package Jdbc;

import java.sql.*;

// executeQuery() — SELECT

public class Lecture1 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();
            String query = "select * from T1";

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("Id : " + rs.getInt("Id") + "\n" +
                        "Name : " + rs.getString("Name") + "\n" +
                        "City : " + rs.getString("City"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
