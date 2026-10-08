package GrassCoachingClass.Compostion;

// Example: Car HAS-A Engine
class Engine{

    void performance(){
        System.out.println("Mercedes-Benz vehicles are synonymous with luxury, cutting-edge technology, and top-tier safety");
    }
}

class Mercedes{

    String modalName;
    private Engine engine;

    Mercedes(String modalName){
        this.modalName = modalName;
        engine = new Engine();
    }

    void display(){
        System.out.println("ModalName : " + modalName);
        engine.performance();
    }
}

public class Lecture1 {
    public static void main(String[] args) {

        Mercedes m = new Mercedes("MayBach");
        m.display();
    }
}
