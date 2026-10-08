package ExceptionHandling;

// Case 2: throw with try-catch

public class Lecture8 {
    public static void main(String[] args) {

        int age = 10;

        try {
            if (age < 18){
                throw new IllegalArgumentException("Age must be 18 or more for vote");
            }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}

/*
What happens?
The programmer throws the exception.
The catch block handles it.
The program continues executing after the catch block.
 */