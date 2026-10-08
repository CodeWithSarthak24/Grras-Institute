package JavaProgram;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lecture1 implements Serializable {
    String jobProfile;
    Lecture1(String jobProfile){
        this.jobProfile = jobProfile;
    }
    public static void main(String[] args) {
        Lecture1 l = new Lecture1("Devops");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("XYZ.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(l);
            System.out.println("Saved");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Failed");
        }
    }
}
