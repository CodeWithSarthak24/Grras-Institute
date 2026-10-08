package GrassCoachingClass.This;

// To invoke the current class method.
public class Problem2 {

    void Test(){
        System.out.println("Method : 1");
    }

    void Display(){
        this.Test();
        System.out.println("Method : 2");
    }

    public static void main(String[] args) {

        Problem2 p1 = new Problem2();
        p1.Display();

    }
}
