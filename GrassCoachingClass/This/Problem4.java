package GrassCoachingClass.This;

// To invoke the current class method.
// Example: Calling Parameterized Constructor from Default Constructor
public class Problem4 {

    Problem4(){
        this("Sarthak", 24);
        System.out.println("Default Constructor");
    }

    Problem4(String name, int age){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Problem4 p1 = new Problem4();
    }
}
