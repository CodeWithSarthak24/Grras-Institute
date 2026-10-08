package GrassCoachingClass.Compostion;

// University Management Example: Student HAS-A ID Card
class IdCard{

    int idNumber;

    IdCard(int idNumber){
        this.idNumber = idNumber;
    }
}

class Student{

    String name;
    String className;
    private IdCard card;

    Student(String name, String className){
        this.name = name;
        this.className = className;
        card = new IdCard(93428);
    }

    void display(){
        System.out.println(name + "\n" + className);
        System.out.println("---------");
        System.out.println(card.idNumber);
    }
}


public class Lecture2 {
    public static void main(String[] args) {

       Student s = new Student("XYZ","Btech");
       s.display();

        Student s2 = new Student("UBC","Btech");
        s2.display();
    }
}
