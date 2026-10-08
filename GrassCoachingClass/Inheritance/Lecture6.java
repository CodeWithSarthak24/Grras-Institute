package GrassCoachingClass.Inheritance;

// Hybrid Inheritance
interface Bicycle{

    void price();
}

interface ElectricCar{

    void speed();

}

class CellPhone{

    void batteryCapacity(){
        System.out.println("5000 Mah");
    }

}

public class Lecture6 extends CellPhone implements Bicycle, ElectricCar  {

   public void price(){
       System.out.println("7000");
    }

    public void speed(){
        System.out.println("400 Km/h");
    }

    public static void main(String[] args) {

       Lecture6 obj = new Lecture6();
       obj.price();
       obj.speed();
       obj.batteryCapacity();
    }
}
