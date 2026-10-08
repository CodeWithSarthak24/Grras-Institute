package GrassCoachingClass.Super;

// Using super to Access Parent Class Instance Variables
public class Problem1 {

    int age = 19;
     String name = "Archiee";
}

class Children extends Problem1{
        int age = 24;
        static String name = "Sarthak";

    void display(){
        System.out.println(super.age + " " + super.name);
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {

        Children c = new Children();
        c.display();

    }
}
