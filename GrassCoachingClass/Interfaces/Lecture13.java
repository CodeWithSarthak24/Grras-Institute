package GrassCoachingClass.Interfaces;

// Marker interface -> Cloneable

public class Lecture13 implements Cloneable{

    String jobProfile;
    String employeeName;

    public Lecture13(String jobProfile, String employeeName) {
        this. jobProfile = jobProfile;
        this.employeeName = employeeName;
    }

    public static void main(String[] args) throws CloneNotSupportedException{

        // ➡️ Create the original object.
        Lecture13 original = new Lecture13("Devops", "Sarthak");

        // ➡️ Create a copy of s1.
        Object Obj = original.clone();
        Lecture13 copy = (Lecture13) Obj;

        System.out.println(original.employeeName + " " + original.jobProfile);
        System.out.println("--------------");
        System.out.println(copy.employeeName + " " + copy.jobProfile);
    }
}

// clone() returns an Object because it is defined in the Object class.
// Therefore, we must typecast the returned object to the actual class type (e.g., Student) before assigning it to a Student reference.