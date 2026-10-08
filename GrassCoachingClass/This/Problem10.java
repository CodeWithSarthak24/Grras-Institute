package GrassCoachingClass.This;


public class Problem10 {

    int age;
    String name;

    void setAge(int age){
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Problem10 p = new Problem10();
        p.setAge(12);
        p.setName("Allie");
        p.display();

       // p.setName("Dean").setAge(22);
        // You cant do like this
    }
}
