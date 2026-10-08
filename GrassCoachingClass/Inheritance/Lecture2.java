package GrassCoachingClass.Inheritance;

// Multilevel Inheritance
class A{

    int grandFatherAge = 65;

    void grandFatherWeightLift(){
        System.out.println("Bench Press : 70Kg");
    }
}

class B extends A{

    int FatherAge = 42;

    void fatherWeightLift(){
        System.out.println("Bench Press : 120Kg");
    }
}

public class Lecture2 extends B {

    int sonAge = 19;

    void sonWeightLift(){
        System.out.println("Bench Press : 60Kg");
    }

    public static void main(String[] args) {
        Lecture2 obj = new Lecture2();
        obj.grandFatherWeightLift();
        obj.fatherWeightLift();
        obj.sonWeightLift();
    }
}
