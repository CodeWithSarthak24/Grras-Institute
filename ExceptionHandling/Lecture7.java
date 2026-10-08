package ExceptionHandling;

// Case 1: throw without try-catch

import java.io.FileNotFoundException;

public class Lecture7 {
    public static void main(String[] args){

       String password = "";

        if (password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty"); // uncheck exception
        }


       // throw new FileNotFoundException();  check exception
    }
}

/*
The JVM sees no runtime error.
The programmer knows an empty password is invalid.
So the programmer reports the error manually using throw
 */

/*
What happens?
The programmer throws the exception.
There is no catch block to handle it.
The exception reaches the JVM.
The JVM prints the error and terminates the program.
 */