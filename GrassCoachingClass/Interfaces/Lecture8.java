package GrassCoachingClass.Interfaces;

// Find the square of a number using a functional interface.

@FunctionalInterface
interface Prob2{

    double square(double a);
}

public class Lecture8 {
    public static void main(String[] args) {

        Prob2 p = a ->  a * a;
        System.out.println(p.square(7.6));
    }
}
