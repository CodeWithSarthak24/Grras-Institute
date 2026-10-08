package GrassCoachingClass.Operator;

// 2. Short-Circuit with ||
// Case 1: First condition is true

public class Lecture3 {
    public static void main(String[] args) {

        int x = 87;
        if (x > 50 || ++x < 90){
            System.out.println("Spring");
        }
        System.out.println(x);


// Case 2: First condition is true

        int y = 87;
        if (y < 50 || ++y > 90){
            System.out.println("Spring");
        }
        System.out.println(y);
    }
}
