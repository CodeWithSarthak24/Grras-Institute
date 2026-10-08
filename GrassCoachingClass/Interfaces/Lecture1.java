package GrassCoachingClass.Interfaces;

// Interface Examples

interface Bank {

    String owner();
    double rateOfInterest();
}

class Pnb implements Bank{

    public String owner(){
        return "David";
    }

    public double rateOfInterest(){
        return 450.00;
    }
}

public class Lecture1 {
    public static void main(String[] args) {

        Bank b = new Pnb();
        System.out.println(b.owner());
        System.out.println(b.rateOfInterest());

    }
}
