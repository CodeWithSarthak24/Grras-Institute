package GrassCoachingClass.Polymorphism;

// Instance initializer block
public class Lecture10 {

    int a;

    Lecture10(){
        System.out.println("Constructor");
    }

    {
        a = 1087;
        System.out.println("Instance");
    }

    public static void main(String[] args) {

        Lecture10 l = new Lecture10();
        System.out.println(l.a);
    }
}
