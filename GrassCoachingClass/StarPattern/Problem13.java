package GrassCoachingClass.StarPattern;
/*

            *
           *  *
          *    *
         *      *

 */
public class Problem13 {
    public static void main(String[] args) {

        int n = 5;

        // left spaces
        for(int i = 1; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            System.out.print("*");

            // middle spaces
            for(int l = 1; l <= (2 * i) - 3; l++){
                System.out.print(" ");
            }
            // second star
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
