package GrassCoachingClass.Polymorphism;

// Compile Time Polymorphism : Method Overloading
public class Lecture1 {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {

        Lecture1 l = new Lecture1();
        System.out.println(l.add(26,42));
        System.out.println( l.add(20,68,43));
    }
}
