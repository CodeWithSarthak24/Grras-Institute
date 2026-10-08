package GrassCoachingClass.Polymorphism;

// Covariant return types
public class Lecture3 {

    Lecture3 display(){
        return new Lecture3();
    }
}

class Test2 extends Lecture3{

    Test2 display(){
        System.out.println("CHILD");
        return new Test2();
    }

    public static void main(String[] args) {

        Test2 t = new Test2();
        t.display();
    }
}