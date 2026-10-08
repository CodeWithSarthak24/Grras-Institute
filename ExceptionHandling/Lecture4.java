package ExceptionHandling;


// Multiple Catch Block in Java

public class Lecture4 {
    public static void main(String[] args) {

        try {
           int[] arr = new int[5];
            System.out.println( arr[90]);
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
