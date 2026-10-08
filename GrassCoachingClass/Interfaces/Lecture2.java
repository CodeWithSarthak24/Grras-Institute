package GrassCoachingClass.Interfaces;

// Implementing Multiple Inheritance Using Interfaces
// how a class can implement multiple interfaces to achieve multiple inheritance.
interface Car{

    void brandName();
}

interface Electronic{

    void deviceName();
}

class Result implements Car, Electronic{

    public void brandName(){
        System.out.println("X- 20a2");
    }

    public void deviceName(){
        System.out.println("Hp pavilion");
    }
}

public class Lecture2 {
    public static void main(String[] args) {

      Car c = new Result();
      c.brandName();

      Electronic e = new Result();
      e.deviceName();

      // or do like this

        Result r = new Result();
        r.brandName();
        r.deviceName();
    }
}
