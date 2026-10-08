package GrassCoachingClass.This;

// To invoke the current class method.
// Example: Calling Default Constructor From Parameterized Constructor
public class Problem3 {

    Problem3(){
        System.out.println("Default Constructor");
    }

    Problem3(int a){
        this();
        System.out.println("Parameterized Constructor " + a);
    }

    public static void main(String[] args) {

        Problem3 p1 = new Problem3(45);

    }
}
