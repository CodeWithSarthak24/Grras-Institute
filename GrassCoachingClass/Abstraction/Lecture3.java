package GrassCoachingClass.Abstraction;

// he abstract class can also be used to provide some implementation of the interface.
// In such case, the end user may not be forced to override all the methods of the interface.
interface Test{

    void method1();
    void method2();
    int method3(int x, int y);
}

abstract class Resolve{
}

abstract class Resolve2 implements Test{

    abstract void display();
    static int multiply(int a, int b){
        return a * b;
    }

    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }
}

class Resolve3 extends Resolve2{

    public int method3(int x, int y){
        return x + y;
    }

    public void display(){
        System.out.println("Display");
    }
}

public class Lecture3 {
    public static void main(String[] args) {

        Test t = new Resolve3();
        t.method1();
        t.method2();
        System.out.println(t.method3(10,30));
      //  t.display();
      //  t.multiply(334,71);
        // Because display() and multiply() are not members of the Test interface, and t is a Test reference,
        // so they can't be accessed through t.

        Resolve2 r = new Resolve3();
        r.display();
        System.out.println(r.method3(23,2));

    }
}
