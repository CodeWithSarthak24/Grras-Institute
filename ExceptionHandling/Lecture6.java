package ExceptionHandling;

// Finally Block

public class Lecture6 {
    public static void main(String[] args) {

        try {
          int[] x = new int[3];
            x[11] = 90;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Closing Resource..............");
        }

    }
}
