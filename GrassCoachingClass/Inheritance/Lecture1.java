package GrassCoachingClass.Inheritance;

// Single Inheritance
class Single{

    int a = 12;
    void display(){
        System.out.println("Print Method");
    }
}
public class Lecture1 extends Single{

    int age = 23;

    public static void main(String[] args) {

        Lecture1 obj = new Lecture1();
        System.out.println(obj.a + " " + obj.age);
        obj.display();
    }
}
