package Jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

// RowSet

/*

Steps to Create a JdbcRowSet:

Create a JdbcRowSet object using RowSetProvider.
Set the database URL using setUrl().
Provide username using setUsername().
Set the password using setPassword().
Define the SQL query using setCommand()

 */

public class Lecture25 {
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();

            rowset.setUrl("jdbc:mysql://localhost:3306/Lecture1");
            rowset.setUsername("root");
            rowset.setPassword("BackendJEE#1");

            rowset.setCommand("select * from T1;");
            rowset.execute();

            while(rowset.next()){
                System.out.println(rowset.getInt("Id") + "\n" +
                        rowset.getString("Name") + "\n" +
                        rowset.getString("City"));
            }

            rowset.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
