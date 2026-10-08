package Dsa.Strings;

public class Lecture4 {
    public static void main(String[] args) {
        String s = "Subject";
        for (int i = 2; i < 5; i++){
            System.out.print(s.substring(i) + " ");
        }
        System.out.println("\n");

        // Given a string s, print all the substrings of s
        // input s = "abcd"
       // output: a ab abc abcd b bc bcd c cd d

        String str = "abcd";
        for (int i = 0; i < str.length(); i++){
           for (int j = i + 1; j < str.length() + 1; j++){
               System.out.print(str.substring(i,j) + " ");
           }
        }
    }
}
