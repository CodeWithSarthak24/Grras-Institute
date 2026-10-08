package Jdbc;

// Result Set

import java.sql.*;

public class Lecture20 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

           Statement st = con.createStatement(
                   ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
           );
           ResultSet rs = st.executeQuery("select * from T1");

               while (rs.next()) {
                   if (rs.getInt("Id") == 123){
                       rs.updateString("City", "China");  // prepare the change
                       rs.updateRow();   // save change to DB

                       if (rs.rowUpdated()){  // check driver's reported status
                           System.out.println("Row Updated");
                       }else {
                           System.out.println("Row not Updated");
                       }
                   }
            }

            rs.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

 /*
    Statement st = con.createStatement(

                   ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
           );
           ResultSet rs = st.executeQuery("select * from T1");

           // TYPE_FORWARD_ONLY does not allow absolute().
            if (rs.absolute(3)) {
                System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("City: " + rs.getString("City"));
            }
            rs.close();

 */

/*

 Statement st = con.createStatement(
                   ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
           );
           ResultSet rs = st.executeQuery("select * from T1");

           // TYPE_FORWARD_ONLY does not allow absolute().
            if (rs.isBeforeFirst()) {
               while (rs.next()) {
                   System.out.println("ID: " + rs.getInt("Id") + "\n" +
                           "Name: " + rs.getString("Name") + "\n" +
                           "City: " + rs.getString("City"));
               }
            }

            rs.close();

 */
