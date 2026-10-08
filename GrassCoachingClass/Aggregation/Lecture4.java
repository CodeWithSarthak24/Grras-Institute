package GrassCoachingClass.Aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ✅ Yes. That's actually one of the biggest reasons Aggregation is called a "Weak HAS-A" relationship.
// The same Teacher object can be associated with multiple departments.
class Teacher{

    String name;
    String qualification;
    int age;

    Teacher(String name, String qualification, int age){
     this.name = name;
     this.qualification = qualification;
     this.age = age;
    }
}

class Department{

    String branch;
    String duration;
    int fees;
    List<Teacher> teachers;

    Department(String branch, String duration, int fees, List<Teacher> teachers){
        this.branch = branch;
        this.duration = duration;
        this.fees = fees;
        this.teachers = teachers;
    }

    void display(){
        System.out.print(branch + "\n" + duration + "\n" + fees);
        System.out.println();
        for (Teacher data : teachers){
            System.out.println(data.name + "\n" + data.qualification + "\n" + data.age);
        }
    }
}

public class Lecture4 {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Sanjay", "Phd", 48);
        Teacher t2 = new Teacher("Sarthak", "M-tech", 21);
        Teacher t3 = new Teacher("Pradeep", "Phd", 54);
        Teacher t4 = new Teacher("Ajeet", "Mbbs", 61);

        Department d1 =  new Department("IT", "4 Years", 540000, Arrays.asList(t1,t2, t3));
        Department d2 =  new Department("AI", "5 Years", 730000, Arrays.asList(t3,t4));

        d1.display();
        System.out.println("------------");
        d2.display();
    }
}
