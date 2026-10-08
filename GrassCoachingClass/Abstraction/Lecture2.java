package GrassCoachingClass.Abstraction;

// Example 2: Bank Abstract Class

abstract class Bank{

    abstract String location();
    abstract int totalAccount();
    abstract String ownerName();
}

class Pnb extends Bank{

    public String location(){
        return "Pune";
    }

    public int totalAccount(){
        return 4500;
    }

    public String ownerName(){
        return "Alex";
    }
}

public class Lecture2 {
    public static void main(String[] args) {

        Bank b = new Pnb();
        System.out.println(b.location());
        System.out.println(b.totalAccount());
        System.out.println(b.ownerName());
    }
}
