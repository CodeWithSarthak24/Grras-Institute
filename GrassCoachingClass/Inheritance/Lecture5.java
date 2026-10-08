package GrassCoachingClass.Inheritance;

/*

Java 8 Default Method Conflict Interviewers sometimes ask this :

interface A {

default void show() {
 System.out.println("A");
   }
 }

 interface B {

  default void show() {
  System.out.println("B");
     }
   }

   class Test implements A, B {
   }

 */

interface Bike {

    default void speed(){
        System.out.println("Top Speed : 138 km/h");
    }

}

interface Car {

    default void speed(){
        System.out.println("Top Speed : 250 km/h");
    }

}

public class Lecture5 implements Bike, Car{

    // Override the method
    @Override
   public void speed(){
        System.out.println("Top Speed : 300 km/h");
    }

    public static void main(String[] args) {

        Lecture5 obj = new Lecture5();
        obj.speed();
    }
}
