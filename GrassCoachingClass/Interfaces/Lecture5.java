package GrassCoachingClass.Interfaces;

// Nested Interface inside a Class

class House{

    void location(String name){
        System.out.println(name);
    }

    interface Bedroom {

        void dimension(double length, double breadth);
    }
}

class Test2 implements House.Bedroom{

    @Override
    public void dimension(double length, double breadth) {
        System.out.println(length + "\n" + breadth);
    }
}

public class Lecture5 {
    public static void main(String[] args) {

        House obj = new House();
        obj.location("Sector 11-B");

        House.Bedroom obj2 = new Test2();
        obj2.dimension(1200.75,8651.09);

    }
}
