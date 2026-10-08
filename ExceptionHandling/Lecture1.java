package ExceptionHandling;

// Java Checked Exceptions

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Lecture1 {
    public static void main(String[] args) {

      /*
        File f = new File("Graph");
        FileReader file = new FileReader(f);
        System.out.println("Succeed");
        file.close();
        */

        try {
            File f = new File("Graph");
            FileReader file = new FileReader(f);
            System.out.println("Succeed");
            file.close();
        }
        catch (IOException e){
          System.out.println(e.getMessage());
        }

    }
}
