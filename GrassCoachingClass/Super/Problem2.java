package GrassCoachingClass.Super;

// Using super to Invoke Parent Class Methods
public class Problem2 {

    void print() {
        System.out.println("Parent Class - Methods");
    }
}

class Test extends Problem2{

    void print() {
        super.print();
        System.out.println("Child Class - Methods");
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.print();
    }
}
