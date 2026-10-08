package Jdbc;

import java.sql.*;

// execute() — SELECT
// But execute() only tells you whether the result is a ResultSet or not. It does not directly give you the rows.

public class Lecture5{
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();
            String query = "select * from T1";

            boolean affectedRow = st.execute(query);

            System.out.println(affectedRow + " row inserted");


            if (affectedRow){
                ResultSet rs = st.getResultSet();
                while (rs.next()){
                    System.out.println("Id : " + rs.getInt("Id") + "\n" +
                            "Name : " + rs.getString("Name") + "\n" +
                            "City : " + rs.getString("City"));
                }
            }


            st.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
