package GrassCoachingClass.Introduction;

public class Problem2 {
    static int count = 2;
    Problem2(){
        count++;
    }
    public static void main(String[] args) {
        new Problem2();// Problem2 p = new Problem();
        new Problem2();
        new Problem2();
        new Problem2();

        System.out.println(count);//6
    }
}
