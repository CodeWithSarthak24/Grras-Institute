package JavaProgram;
// hello how are you  - > olleh woh era uoy
public class Lecture33 {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(reverse(str));
      //  System.out.println(str);

    }

    public static String reverse(String str){
        char[] ch = str.toCharArray();
        String st = "";
        for (int i = ch.length-1; i >= 0 ; i--){
           st += ch[i];
        }
        return st;
    }
}
