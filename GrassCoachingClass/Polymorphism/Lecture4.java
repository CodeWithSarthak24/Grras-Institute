package GrassCoachingClass.Polymorphism;

// Method hiding
public class Lecture4 {

    static void print(){
        System.out.println("PARENT");
    }
}

class Test3 extends Lecture4{

    static void print(){
        System.out.println("CHILD");
    }

    public static void main(String[] args) {

        Lecture4 l = new Test3();
        l.print();
    }
}