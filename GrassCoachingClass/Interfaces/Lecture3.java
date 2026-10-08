package GrassCoachingClass.Interfaces;

// how one interface can inherit another interface and
// how a class implements the child interface by providing implementations for all inherited methods.

interface First{

    void display1();
}

interface Second{

    void display2();
}

interface Third extends First, Second{

    void display3();
}

class Show implements Third{

   public void display1(){
       System.out.println("D1");
   }

    public void display2(){
        System.out.println("D2");
    }

    public void display3(){
        System.out.println("D3");
    }
}

public class Lecture3 {
    public static void main(String[] args) {

        Show s = new Show();
        s.display1();
        s.display2();
        s.display3();
    }
}
