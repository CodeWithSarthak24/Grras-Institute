package GrassCoachingClass.Aggregation;

import java.util.ArrayList;
import java.util.List;

// If a Department has multiple Teachers, then instead of storing a single Teacher object:
// You store a Collection such as List<Teacher>.
// Aggregation: Example (One Department → Many Teachers)
// Many professor teach student
class Professor{

    String name;
    int age;
    String address;

    Professor(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Student{

    String name;
    String university;
    List<Professor> professors;

    Student(String name, String university, List<Professor> professors){
        this.name = name;
        this.university = university;
        this.professors = professors;
    }

    void display(){
        System.out.println(name + "\n" + university);
    }

    void access(){
        for (Professor data : professors){
            System.out.println(data.name + "\n" + data.age + "\n" + data.address);
        }
    }
}

public class Lecture3 {
    public static void main(String[] args) {

        Professor p1 = new Professor("Pramod sir", 31, "Gwalior");
        Professor p2 = new Professor("Sanjay sir", 46, "Shivpuri");
        Professor p3 = new Professor("Alak sir", 29, "Delhi");

        List<Professor> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Student s = new Student("Sarthak", "Oxford University", list);
        s.display();
        System.out.println("--------------");
        s.access();
    }
}
