package GrassCoachingClass.Introduction;
// Static Shared by Objects
public class Problem3 {
    static int age = 23;
    public static void main(String[] args) {

        Problem3 p1 = new Problem3();
        Problem3 p2 = new Problem3();

        p1.age= 12;

        System.out.println(p1.age);
        System.out.println(p2.age);

    }
}
