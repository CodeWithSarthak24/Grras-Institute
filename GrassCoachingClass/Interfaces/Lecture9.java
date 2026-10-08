package GrassCoachingClass.Interfaces;

// Print a greeting message using a lambda expression.

@FunctionalInterface
interface Prob3{

    void message();
}


public class Lecture9 {
    public static void main(String[] args) {

        Prob3 p = () -> System.out.println("Hello");
        // call the method
        p.message();
    }
}
