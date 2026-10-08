package ExceptionHandling;

// 1. Handle NumberFormatException: It occurs when we try to convert a string that is not a valid number into an integer using Integer.parseInt().

public class Lecture14 {
    public static void main(String[] args) {

      /*  String s = "11";
        int i = Integer.parseInt(s);
        System.out.println(i);
      */

        String q = "jgf";
        try{
            int w =  Integer.parseInt(q);
            System.out.println(w);
        }catch(NumberFormatException e){
            System.out.println("Invalid Input");
        }
    }
}
