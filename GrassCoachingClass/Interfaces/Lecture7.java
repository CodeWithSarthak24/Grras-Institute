package GrassCoachingClass.Interfaces;

// Functional interface
// Write a Java program to create a functional interface named Calculator with a method calculate(int a, int b).
// Use a lambda expression to perform: Addition, Subtraction, Multiplication

@FunctionalInterface
interface Calculator{

   double calculate(int a, int b);
}

public class Lecture7{
    public static void main(String[] args) {

        // Addition
        Calculator c = (a,b) -> a + b;
        System.out.println(c.calculate(98, 90));

        // Multiply
        Calculator c1 = (a,b) -> a * b;
        System.out.println(c1.calculate(112,10));
    }
}

/*

Rule to remember
0 arguments → () ->
1 argument → x ->
2 or more arguments → (x, y) ->

 */
