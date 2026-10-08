package ExceptionHandling;

// InputMismatchException : It occurs when the user enters a value of a different type than expected by Scanner.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            int a = input.nextInt();
            System.out.println(a);
        }catch (InputMismatchException e){
            System.out.println("Please enter only numbers.");
        }

    }
}
