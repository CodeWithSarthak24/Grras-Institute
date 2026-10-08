package ExceptionHandling;

public class Lecture12 {

    static int divide(int x, int y) throws ArithmeticException{
        int z;
        z = x /y;
        return z;
    }
    public static void main(String[] args) {

        try {
            divide(10,90);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Processing.........");
    }
}
