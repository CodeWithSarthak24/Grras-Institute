package Dsa.Strings;

public class Lecture2 {
    public static void main(String[] args) {

        // toLowerCase(), toUpperCase(), concat()

        String str = "DSA";
        System.out.println(str.toLowerCase());

        String str2 = "java";
        System.out.println(str2.toUpperCase());

        String str3 = "Web";
        String ans = str3.concat(" Developer");
        System.out.println(ans);

        // add char, integer, String

        String str4 = "Cache";
        str4 += "temp";
        str4 += 's';
        str4 += 40;
        System.out.println(str4);
        System.out.println(str4 + 10 + 30);
        System.out.println(10 + 50 + str4);

        // subString(i,j), subString(i)

        String str5 = "abcde";
        System.out.println(str5.substring(0,2));
        System.out.println(str5.substring(2));

    }
}
