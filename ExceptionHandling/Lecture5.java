package ExceptionHandling;

// Nested Try Block

public class Lecture5 {
    public static void main(String[] args) {

        try {
            System.out.println("Outer");
            try {
                System.out.println("Inner");
                int a = 10 / 0;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Processing");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End........");
    }
}

// Note :-
// When any try block does not have a catch block for a particular exception,
// then the catch block of the outer (parent) try block is checked for that exception,
// and if it matches, the catch block of the outer try block is executed.
// If none of the catch blocks specified in the code are able to handle the exception,
// then the Java runtime system will handle the exception. Then, it displays the system-generated message for that exception.