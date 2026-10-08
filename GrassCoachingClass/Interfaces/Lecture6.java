package GrassCoachingClass.Interfaces;

// Check if a number is even or odd using a lambda expression.

@FunctionalInterface
interface Prob1{

    boolean check(int a);
}

public class Lecture6 {
    public static void main(String[] args) {

        Prob1 p = a -> (a % 2 == 0) ? true : false;
        System.out.println(p.check(27));
    }
}
