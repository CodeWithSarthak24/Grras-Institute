package GrassCoachingClass.StarPattern;
/*

 *
 * *
 * * *
 * * * *
 * * *
 * *
 *

 */
public class Problem3 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        int m = 4;
        for (int i = m; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
