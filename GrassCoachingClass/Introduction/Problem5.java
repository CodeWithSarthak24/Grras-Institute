package GrassCoachingClass.Introduction;
//Compilation error occurs because a static method cannot directly access non-static (instance) variables.
public class Problem5 {
    int x = 12;
    public static void main(String[] args) {
       // System.out.println(x);
    }
}
