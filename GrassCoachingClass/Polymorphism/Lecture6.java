package GrassCoachingClass.Polymorphism;

// Final reference variable
public class Lecture6 {

    String name;

    public static void main(String[] args) {

        final Lecture6 l = new Lecture6();
        System.out.println(l.name = "Alex");

       //  l = new Lecture6(); error
    }
}
