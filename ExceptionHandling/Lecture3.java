package ExceptionHandling;

// Multiple Catch Block in Java

// Q3. Write a program that handles: ArithmeticException, NullPointerException using multiple catch blocks.

public class Lecture3 {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Welcome Back");
    }
}
