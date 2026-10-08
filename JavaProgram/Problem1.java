package JavaProgram;

public class Problem1 {

    public static String change(String s){

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "Sarthak sen";
        System.out.println(change(str));

    }
}
