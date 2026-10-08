package GrassCoachingClass.Inheritance;

// Hierarchical Inheritance
class Base{

    void base(){
        System.out.println("Base Class");
    }
}

class Intermediate extends Base{

    void intermediate(){
        System.out.println("Intermediate Class");
    }
}

public class Lecture3 extends Base{

    void lecture3(){
        System.out.println("Lecture3 Class");
    }

    public static void main(String[] args) {

        Lecture3 l = new Lecture3();
        l.lecture3();
        l.base();
     // l.Intermediate;
    }
}
