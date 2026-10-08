package Dsa.Strings;

public class Lecture3 {
    public static void main(String[] args) {

        // trim() : Removes starting and ending spaces.

        String s = " hack";
        System.out.println(s.trim());

        // replace()

        String q = "Agile";
        System.out.println(q.replace('A','a'));

        // lastIndexOf()

        String w = "Java";
        System.out.println(w.lastIndexOf('a'));

        // isEmpty()

        String r = "";
        String t = " ";
        System.out.println(t.isBlank());
        System.out.println(r.isEmpty());

        // split()

        String y = "Radiation";
        System.out.println();

        // equalsIgnoreCase() : checks whether two strings are equal without considering uppercase and lowercase letters.

        String u = "PLAYGROUND";
        String i = "playground";
        System.out.println(u.equalsIgnoreCase(i));

        // compareToIgnoreCase() : compares two strings in dictionary (lexicographical) order without considering uppercase and lowercase letters.

        String o = "FGH";
        String p = "PLA";
        System.out.println(o.compareToIgnoreCase(p));

        String s1 = "abc";
        String c2 = "xyz";
        c2 = "us";
        s1 = "uy";
        System.out.println(s1);

    }
}
