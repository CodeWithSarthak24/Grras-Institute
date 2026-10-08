package GrassCoachingClass.This;

// We pass this when a method needs access to the current object.
// Instead of passing individual fields, we pass the entire object reference so the receiving method can access all the object's data and behavior.
// It is commonly used in event handling, validation, logging, registration, service methods, and design patterns like Observer.
class Employee{

    int id = 764654;
    String name = "Dean";
    String departmentName = "Data Analyst";
    double salary = 54000.00;

    void categories() {
        System.out.println("Software Engineer");
    }

    void display(){
        Department d = new Department();
        d.print(this);
    }
}

class Department{

    void print(Employee obj){
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.departmentName);
        System.out.println(obj.salary);
        obj.categories();
    }
}

public class Problem7 {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.display();
    }
}

/*

Why Use It? -> Without this:

c.addStudent(name); // Only name is sent. But college may need: name, age, city, roll number.

So send the whole object:

c.addStudent(this);

 */