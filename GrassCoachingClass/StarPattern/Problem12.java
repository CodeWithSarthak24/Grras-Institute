package GrassCoachingClass.StarPattern;
/*

        *      *
         *    *
          *  *
           *

 */
public class Problem12 {
    public static void main(String[] args) {

        int row = 4, col = 7;
        for (int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if (i == j || i + j == 8){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
