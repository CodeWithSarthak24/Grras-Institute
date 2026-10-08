package GrassCoachingClass.Polymorphism;

// Final parameter
public class Lecture9 {

    void display(final int a){
        // a = 55; error
        System.out.println(a);
    }

    public static void main(String[] args) {

        Lecture9 l = new Lecture9();
        l.display(987);
    }
}
