package GrassCoachingClass.This;

//  Using this to Pass the Current Object as a Method Argument
//  Example : 2. One Method Wants to Access Another Method Using this
//Suppose one method wants to send the current object to another method.
public class Problem6{

    int age = 34;
    String name = "Bros";

    void method1(Problem6 p){
        System.out.println(p.age + " " + p.name);
    }

    void method2(){
        method1(this);
    }

    public static void main(String[] args) {

        Problem6 p = new Problem6();
        p.method2();
    }
}
