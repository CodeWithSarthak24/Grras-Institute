package Jdbc;

import java.sql.*;

// Callable Statement : UPDATE

public class Lecture15 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            CallableStatement cs = con.prepareCall("{call updateStudentDetail(?,?)}");

            cs.setInt(1, 1781);
            cs.setString(2,"Backend");


            int rowAffected = cs.executeUpdate();
            System.out.println("rowAffected = " +rowAffected);

            cs.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

/*

2. UPDATE procedure

DELIMITER //

CREATE PROCEDURE updateStudent(
    IN studentId INT,
    IN studentCity VARCHAR(50)
)
BEGIN
    UPDATE T1
    SET City = studentCity
    WHERE Id = studentId;
END //

DELIMITER ;

CALL updateStudent(105, 'Delhi');

 */