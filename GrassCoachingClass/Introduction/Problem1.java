package GrassCoachingClass.Introduction;
                  // Topic : Variables
public class Problem1 {
    int age = 30;
    static String name = "Sarthak";
    public static void main(String[] args) {

        Problem1 p1 = new Problem1();
        Problem1 p2 = new Problem1();

        p2.age = 45;
        System.out.println(p1.age);
        System.out.println(p2.age);

        System.out.println(name);

      //  Q) Why no object required?
        // Ans: Static variables are loaded during class loading, so they can be accessed directly without creating an object.
        // Only one copy of static variable exists in memory and all objects share it


    }
}
