package ExceptionHandling;

// Example 1: Custom Exception with Message

class IllegalAgeException extends Exception{

    public IllegalAgeException(String message) {
        super(message);
    }
}

class ProblemSolving{

    static void checkAge(int age) throws IllegalAgeException{
        if (age < 18){
            throw new IllegalAgeException("Wrong age is entered");
        }
        else {
            System.out.println("Correct age is entered");
            System.out.println("Eligible");
        }
    }
}

public class Lecture13 {
    public static void main(String[] args){

      try {
          ProblemSolving.checkAge(8);
      }
      catch (IllegalAgeException ex){
          System.out.println(ex.getMessage());
      }
        System.out.println("Processing.........");
    }
}
