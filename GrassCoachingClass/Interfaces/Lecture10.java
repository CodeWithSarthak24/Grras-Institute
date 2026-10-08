package GrassCoachingClass.Interfaces;

// Find the maximum of two numbers using a functional interface.

@FunctionalInterface
interface Prob4{

    int findMax(int a, int b);
}

public class Lecture10 {
    public static void main(String[] args) {

        Prob4 p = (a,b) -> (a > b) ? a : b;
        System.out.println(p.findMax(10,34));
    }
}
