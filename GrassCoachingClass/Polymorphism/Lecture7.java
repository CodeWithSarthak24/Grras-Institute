package GrassCoachingClass.Polymorphism;

// Inheriting the final method
public class Lecture7 {

    final void print(){
        System.out.println("inheriting");
    }
}

class Test4 extends Lecture7{

    public static void main(String[] args) {

     // or  new Test4().print();
        Test4 t = new Test4();
        t.print();

    }
}
