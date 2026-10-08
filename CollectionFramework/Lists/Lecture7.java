package CollectionFramework.Lists;

// Iterable interface

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lecture7 {
    public static void main(String[] args) {

        int sum = 0;

        Iterable<Integer> it = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7));
        Iterator<Integer> i = it.iterator();

        while (i.hasNext()) {
         sum += i.next();
        }
        System.out.println("Sum = " + sum);

        // Print Only Even Numbers

         Iterable<Integer> even = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 18));
         Iterator<Integer> itr = even.iterator();

         while (itr.hasNext()) {
            int output =  itr.next();
            if (output % 2 == 0) {
                System.out.print(output + " ");
            }
         }

        System.out.println();

        Iterable<String> str = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        Iterator<String> strIt = str.iterator();

        while (strIt.hasNext()) {
           String s = strIt.next();
            System.out.print(s + " ");
        }
        System.out.println();

        // Find the Maximum Number

        int maxNumber = Integer.MIN_VALUE;
        Iterable<Integer> max = new ArrayList<>(Arrays.asList(1, 92, 3, 4, 18));
        Iterator<Integer> itr2 = max.iterator();

        while (itr2.hasNext()) {
             int number = itr2.next();
           if (maxNumber < number) {
               maxNumber = number;
           }
        }
        System.out.println("Max : " + maxNumber);
    }
}

// 1. it.forEach(System.out::println) : ➡️ Directly goes through all elements of the Iterable and prints them.

// 2. it.iterator().forEachRemaining(System.out::println): ➡️ First creates an Iterator, then prints all remaining elements.