package GrassCoachingClass.Abstraction;

// Example 1: Shape Abstract Class

abstract class Shape{

    abstract void color();
    abstract void formula();
}

class Rectangle extends Shape{

    public void color(){
        System.out.println("Red");
    }

    public void formula(){
        System.out.println("Rectangle formula");
    }
}

class Circle extends Shape{

    public void color(){
        System.out.println("Blue");
    }

    public void formula(){
        System.out.println("Circle formula");
    }
}

public class Lecture1 {

    public static void main(String[] args) {

        Shape s = new Rectangle();
        s.color();
        s.formula();
    }
}
