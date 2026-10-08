package GrassCoachingClass.StarPattern;
/*

     *
   *  *
  *    *
   *  *
    *

 */
public class Problem16 {
    public static void main(String[] args) {

        int n = 5;
      // Upper Part
        for (int i = 1; i <= n; i++) {

            // left spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            // middle spaces
            for (int l = 1; l <= (2 * i) - 3; l++) {
                System.out.print(" ");
            }

            // second star
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println();
        }


// Lower Part
        for (int i = n - 1; i >= 1; i--) {

            // left spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            // middle spaces
            for (int l = 1; l <= (2 * i) - 3; l++) {
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
