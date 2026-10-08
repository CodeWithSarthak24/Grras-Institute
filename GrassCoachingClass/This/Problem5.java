package GrassCoachingClass.This;

// Using this to Pass the Current Object as a Method Argument
// Example : 1. One Class Wants to Access Another Class's Properties Using this
// Suppose a Student class wants to give its information to a College class.

 class Student{

     int id = 2353;
     String name = "Allie";
     long mark = 93;

     void sendData(){
         College c = new College();
         c.receiveData(this);
     }
 }

 class College{

     void receiveData(Student obj){
         System.out.println(obj.id);
         System.out.println(obj.name);
         System.out.println(obj.mark);
     }
 }

public class Problem5 {
    public static void main(String[] args) {

        Student std = new Student();
        std.sendData();
    }
}

/*

The College class receives the Student object and can access all its properties.

Purpose : Instead of sending

college.addStudent(name, age);

we send the entire object:

college.addStudent(this);

 */

/*
Example : college.addStudent(this);

Inside register(), the keyword 'this' refers to the current object of the class where the code is executing.
The code is executing inside the Student class, not the College class.

 */