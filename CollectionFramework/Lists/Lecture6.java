package CollectionFramework.Lists;

// Practice Problem 4: Add an Element After Every Even Number ⭐ Medium
// Problem: Insert 100 immediately after every even number.
// Input: [1, 2, 3, 4], Output: [1, 2, 100, 3, 4, 100]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Lecture6 {
    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7));

        ListIterator<Integer> li = c.listIterator();
        while (li.hasNext()){
           int num = li.next();
           if(num % 2 == 0){
             li.add(100);
           }
        }
        System.out.println(c);
    }
}
