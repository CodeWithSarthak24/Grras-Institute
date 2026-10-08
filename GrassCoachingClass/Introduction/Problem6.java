package GrassCoachingClass.Introduction;
                    // Topic : Operator
public class Problem6 {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 30;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a % b);
        System.out.println(a / b);
        System.out.println(a * b);

        System.out.println("----------   ----------");

        // 2. Assignment Operators
        a += 60;
        System.out.println(a);

        int p = 67;
        p += 3;
        p *= 10;
        System.out.println("p : " + p);

        System.out.println("----------   ----------");

        // 3. Relational Operators
        System.out.println(10 != 12);
        System.out.println(100 <= 90);

        System.out.println("----------   ----------");

        // 4.Logical Operators
        int age = 24;
        System.out.println(age <= 18 && age > 0);
        System.out.println(!true);
        System.out.println(true || true && false);

        System.out.println("----------   ----------");

        // 5. Ternary Operator
        int Age = 19;
        String vote = ( Age > 18) ? "Eligible" : "Not Eligible";
        System.out.println(vote);

      //  Q) Biggest Between Two Numbers
        int x = 90, y = 100;
        String ans = (x > y) ? "Greater" : "Smaller";
        int max = (x > y) ? x : y;
        System.out.println(ans);
        System.out.println(max);

        // Q) Character check
        char c = 'A';
        String find = (c == 'A')? "Correct" : "Not Found";
        System.out.println(find);

        System.out.println("----------   ----------");

        // 6. Unary Operator
        int o = 2;
        o = o++ + ++o;
        System.out.println(o);

        int z = 5;
        z = ++z + z++ + z + --z + z--;
        System.out.println(z);

        System.out.println("----------   ----------");

        // 7. Bitwise Operator
        int u = 5, n = 3;
        System.out.println(u & n);
        System.out.println(u | n);

        int q = 20, w = 12;
        System.out.println(q & w);
        System.out.println(q | w);

        int xa = 15, xb = 19;
        System.out.println(xa & xb);
        System.out.println(xa | xb);

        int ya = 21, yb = 35;
        System.out.println(ya & yb);
        System.out.println(ya | yb);

        System.out.println("----------   ----------");

        // 8. Shift Operator
        // Rule : x << n = x × 2ⁿ
        System.out.println(10 << 3);
    }
}
