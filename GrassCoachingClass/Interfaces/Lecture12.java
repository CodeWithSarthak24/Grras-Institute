package GrassCoachingClass.Interfaces;

// Marker interface -> Serializable

import java.io.*;

public class Lecture12 implements Serializable {

    int jobId;
    String jobProfileName;
    double salary;
    double experience;

    public Lecture12(int jobId, String jobProfileName, double salary, double experience) {
        this.jobId = jobId;
        this.jobProfileName = jobProfileName;
        this.salary = salary;
        this.experience = experience;
    }

    public static void main(String[] args) throws IOException {

        // Create Student object
        Lecture12 L = new Lecture12(18237, "Agile", 34000.00, 4.2);

        // Step 1: Create/Open the file "Data.txt"
        FileOutputStream fs = new FileOutputStream("Data.txt");

        // Step 2: Create ObjectOutputStream using FileOutputStream
        ObjectOutputStream os = new ObjectOutputStream(fs);

        // Step 3: Write the Student object into the file
        os.writeObject(L);

        // Step 4: Close the streams
        os.close();
        fs.close();
        System.out.println("Done Successfully");

    }
}
