package GrassCoachingClass.Operator;

// Ternary operator

public class Lecture7 {
    public static void main(String[] args) {

        int age = 45;

        System.out.println( (age >= 18) ? "vote" : "not eligible");

        char c = 'u';

        System.out.println(( c >= 'A' & c <= 'Z') ? "uppercase" : "lowercase");
    }
}

/*

Interview rule
✅ Use && for combining boolean conditions in if, while, and ternary operators.
⚠️ Use & mainly for bitwise operations on integers. It can work with booleans,
but it's rarely the preferred choice because it always evaluates both sides.
 */