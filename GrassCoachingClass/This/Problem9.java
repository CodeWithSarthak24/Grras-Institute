package GrassCoachingClass.This;

// Using this to Return the Current Class Instance
public class Problem9 {

    Problem9 printName(){
        System.out.println("Allie");
        return this;
    }

    Problem9 printAge(){
        System.out.println("29");
        return this;
    }

    public static void main(String[] args) {

        Problem9 p = new Problem9();
        Problem9 obj1 = p.printName();
        Problem9 obj2 = p.printAge();
        System.out.println(obj1);
        System.out.println(obj1 == p);
        System.out.println("------------------");
        p.printAge().printName();
    }
}
