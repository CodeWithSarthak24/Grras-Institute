package GrassCoachingClass.Operator;

// 1. Short-Circuit with &&
// Case 1: First condition is false

public class Lecture1 {

    public static void main(String[] args) {

        int a = 10;
       if (a > 29 && a++ < 8){
           System.out.println("Hello");
       }
        System.out.println(a);



// Case 2: First condition is true

        int b = 10;
        if (b < 29 && b++ > 8){
            System.out.println("Hello");
        }
        System.out.println(b);

    }
}

/*

Remember, a++ is post-increment:
Use the current value (10) for the comparison.
Then increment value A to 11.

 */