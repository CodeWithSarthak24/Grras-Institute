package GrassCoachingClass.Operator;

// Unary operator

public class Lecture6 {
    public static void main(String[] args) {

        int a = 10;
        int ans = a++ + --a + a + a-- + a++ + ++a;
        System.out.println(ans);

        int c = 8, d = 10;
        int result =  --c + d++ + c++ + --d - c - d + --d;
        System.out.println(result);
    }
}
