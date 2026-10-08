package Dsa.Strings;
// import java.util.Scanner;
public class Lecture1 {
    public static void main(String[] args) {

        // Declaration and initialisation :-

         //  Scanner sc = new Scanner(System.in);
        // System.out.println("Enter : ");

       //  String str = sc.next();
      //  String str = sc.nextLine();
      //  System.out.println(str);

        //  CharAt() and Length() :-

        String str = "Developer";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));

        System.out.println(str.length());

        // indexOf() and compareTo()

        System.out.println(str.indexOf('D'));
        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("v"));

        String str1 = "abc";
        String str2 = "xyz";
        System.out.println(str1.compareTo(str2)); // Negative

        String str3 = "vbc";
        String str4 = "uyz";
        System.out.println(str3.compareTo(str4)); // Positive

        String str5 = "tyt";
        String str6 = "tyt";
        System.out.println(str5.compareTo(str6)); // Zero

        // Here compareTo work : Lexicographical comparison means comparing two strings character by character from left to right.

        // contain()

        String str7 = "Java Developer";
        System.out.println(str7.contains("ava"));

        // endWith() and startWith()

        System.out.println(str7.endsWith("per"));
        System.out.println(str7.startsWith("Java"));

     }
}
