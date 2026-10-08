package GrassCoachingClass.Interfaces;

// Nested Interface (Nested Interface inside another Interface)

interface A1 {

    int add(int x, int y);

    interface A2 {

        double multiply(int x, int y);

        default void print(){
            System.out.println("Nested Interface");
        }
    }
}

class Shows implements A1, A1.A2{

    @Override
    public int add(int x, int y) {
        return  (x + y);
    }

    @Override
    public double multiply(int x, int y){
        return (x * y);
    }
}

public class Lecture4 {
    public static void main(String[] args) {

        A1 a = new Shows();
        System.out.println(a.add(45,98));

        A1.A2 a2 = new Shows();
        System.out.println(a2.multiply(34,67));
        a2.print();
    }
}
