package ExceptionHandling;

// throw keyword : Checked

import java.io.FileInputStream;
import java.io.IOException;

public class Lecture9 {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("Agile");
            throw new IOException("Not Found");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

/*
public class Lecture9 {
    public static void main(String[] args) throws IOException{

        FileInputStream file = new FileInputStream("Agile");
        throw new IOException("Not Found");
    }
}
*/