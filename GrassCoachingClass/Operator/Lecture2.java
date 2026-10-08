package GrassCoachingClass.Operator;

// Without Short-Circuit (&)

public class Lecture2 {
    public static void main(String[] args) {

        int a = 10;
        if (a < 5 & ++a > 10){
            System.out.println("Java");
        }
        System.out.println(a);


    }
}

