package CollectionFramework.Lists;

// Practice Problem 3: Replace Negative Numbers ⭐ Medium
// Problem: Use ListIterator to replace every negative number with 0.
// Input: [10, -5, 20, -8, 30], Output: [10, 0, 20, 0, 30]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Lecture5 {
    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(10,-20,30,40,-50));

        ListIterator<Integer> li = c.listIterator();
        while (li.hasNext()) {
          int num = li.next();
          if (num < 0) {
              li.set(0); // Replaces the current element in the list
          }
        }
        System.out.println(c);
    }
}
