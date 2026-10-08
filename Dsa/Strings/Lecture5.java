package Dsa.Strings;

import java.util.Scanner;

public class Lecture5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        // APpLe = apPpE

        for (int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            boolean flag = true; // initially it is capital
            int ascii = (int)ch;
            if (ascii < 97){ // capital
                ascii += 32;
            }
            else {
                ascii -= 32;
            }
            sb.setCharAt(i, (char) ascii);
            // We use (char) ascii because setCharAt() accepts a character, not an integer,
            // so we convert the ASCII value back into a character before storing it.
        }
        System.out.println(sb);
    }
}
