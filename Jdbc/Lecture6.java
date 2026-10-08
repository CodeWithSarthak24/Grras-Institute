package Jdbc;

import java.sql.*;

// execute() — INSERT/UPDATE/DELETE
// Why? false
// Because INSERT/UPDATE/DELETE does not return a ResultSet. But rows were affected. So we can get the affected row count:
public class Lecture6 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();
            String query = "UPDATE T1 SET Name = 'Giant' WHERE Id = 786;";

            boolean result = st.execute(query);

            System.out.println(result);

            int affectedRow = st.getUpdateCount();
            System.out.println("affectedRow = " + affectedRow);

            st.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

/*

if (result);
Means: If result is true
-------
if (!result);
! means NOT: If result is false
 */
