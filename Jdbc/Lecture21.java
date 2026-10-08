package Jdbc;

//  Batch Processing using Statement
// executeBatch() is designed to return update counts for operations like INSERT, UPDATE, and DELETE.

// “JDBC batch processing is mainly used for INSERT, UPDATE, and DELETE operations because they return affected row counts.
// SELECT returns a ResultSet, so we normally use executeQuery() instead of batch processing.”

import java.sql.*;

public class Lecture21 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Statement st = con.createStatement();

            st.addBatch("insert into T1 values (1800, 'Hulk','New York');");
            st.addBatch("insert into T1 values (1801, 'Captain','New York');");
            st.addBatch("insert into T1 values (1802, 'Dr Stranger','New York');");

             int[] affectedRow = st.executeBatch();

             for (int ans : affectedRow) {
                 System.out.println(ans);
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
