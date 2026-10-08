package GrassCoachingClass.Super;

// Using super to Invoke Parent Class Constructor
public class Problem3 {

    Problem3(){
        System.out.println("Parent Class - Constructor");
    }

}

class Son extends Problem3{

    Son(){
        super();
        System.out.println("Child Class - Constructor");
    }

    public static void main(String[] args) {

        Son s = new Son();
    }
}
