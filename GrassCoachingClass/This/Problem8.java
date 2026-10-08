package GrassCoachingClass.This;

// Using this to Pass the Current Object in a Constructor Call
// Example 1: Registration System
// Suppose every time a Student is created, the College should automatically register that student.
class Child{

    int age;
    String name;

    Child(int age, String name){
        this.age = age;
        this.name = name;
        Parent p = new Parent();
        p.addChild(this);
    }
}

class Parent{

    void addChild(Child obj){
        System.out.println(obj.age + " " + obj.name);
    }
}

public class Problem8 {
    public static void main(String[] args) {

      Child c = new Child(1,"Priyanka");
    }
}
