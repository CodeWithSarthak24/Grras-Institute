package Jdbc;

import java.sql.*;

// Callable Statement : INSERT

public class Lecture13 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            CallableStatement cs = con.prepareCall("{call fillStudentDetail(?,?)}");

            cs.setInt(1, 1791);
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

1. INSERT procedure:

DELIMITER //

CREATE PROCEDURE addStudent(
    IN studentId INT,
    IN studentName VARCHAR(50),
    IN studentCity VARCHAR(50)
)
BEGIN
    INSERT INTO T1
    VALUES (studentId, studentName, studentCity);
END //

DELIMITER ;


CALL addStudent(105, 'Sarthak', 'Bhopal');

 */