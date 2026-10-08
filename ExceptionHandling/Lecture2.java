package ExceptionHandling;

// Java Unchecked Exceptions (Runtime Exceptions)

public class Lecture2 {
    public static void main(String[] args) {

        String[] s = new String[5];
        try {
            System.out.println(s[21]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
