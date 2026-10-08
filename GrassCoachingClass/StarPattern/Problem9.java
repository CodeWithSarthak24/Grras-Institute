package GrassCoachingClass.StarPattern;
/*

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

 */
public class Problem9 {
    public static void main(String[] args) {

        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }for (int k = 1; k < i; k++){
                System.out.print("*");
            }for (int l = 2; l < i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        int m = 5;
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }for (int k = 4; k >= i; k--){
                System.out.print("*");
            }for (int l = 3; l >= i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
