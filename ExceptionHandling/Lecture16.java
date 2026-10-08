package ExceptionHandling;

// 3. Custom Exception for Password Length

import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Lecture16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            String password = input.next();
            if (password.length() < 6) {
                throw new InvalidPasswordException("Password too short");
            }
                System.out.println(password);
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password" + e);
        }
    }
}
