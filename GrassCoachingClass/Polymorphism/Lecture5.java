package GrassCoachingClass.Polymorphism;

// Blank final variable
public class Lecture5 {

    final int age;

    Lecture5(int age){
        this.age = age;
        System.out.println(this.age);
    }

    public static void main(String[] args) {

        Lecture5 l = new Lecture5(87);
    }
}
