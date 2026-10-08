package GrassCoachingClass.Aggregation;

// Gym has machine
class Gym{

    String location;
    double fees;

   Gym(String location, double fees){
       this.location = location;
       this.fees = fees;
   }
}

class Machine{

    String name;
    int quantity;
    double machinePrice;
    Gym gym;

    Machine(String name, int quantity, double machinePrice){
        this.name = name;
        this.quantity = quantity;
        this.machinePrice = machinePrice;
    }

    public void setGym(Gym gym){
        this.gym = gym;
    }

    void display(){
        System.out.println(name + "\n" + quantity + "\n" + machinePrice);
    }

    void access(){
        System.out.println(gym.location + "\n" + gym.fees);
    }
}

public class Lecture2 {
    public static void main(String[] args) {

        Gym gym = new Gym("Tokyo", 6500);
        Machine machine = new Machine("Bench Press Machine", 11, 5000);
        machine.display();
        machine.setGym(gym);
        machine.access();

    }
}


