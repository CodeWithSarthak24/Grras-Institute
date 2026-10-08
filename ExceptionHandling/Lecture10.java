package ExceptionHandling;

// throws

import java.util.Scanner;
 class IllegalNumberException extends RuntimeException{
    public IllegalNumberException(String message) {
        super(message);
    }
}
public class Lecture10 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        int num = sc.nextInt();
        if (num < 18){
            throw new IllegalNumberException("Invalid Value.......");
        }
        System.out.println("hello");
    }
}
