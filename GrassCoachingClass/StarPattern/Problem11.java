package GrassCoachingClass.StarPattern;
/*

       *
     *
   *
 *

 */
public class Problem11 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= 5; j++){
               if (i == j){
                   System.out.print("*");
               }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
