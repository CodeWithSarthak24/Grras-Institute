package GrassCoachingClass.Polymorphism;

// Run Time Polymorphism : Method Overriding
public class Lecture2 {

    void display(){
        System.out.println("Parent - Reusability");
    }
}

class Test extends Lecture2{

    void display(){
        System.out.println("Child - Reusability");
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.display();
    }
}
