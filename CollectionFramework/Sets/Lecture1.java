package CollectionFramework.Sets;

// Set interface : Performing Various Operations on Set

import java.util.HashSet;
import java.util.Set;

public class Lecture1 {
    public static void main(String[] args) {

        // 1. Adding Elements

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1);

        // 2. Accessing the Elements

        System.out.println(s1.contains(2));

       // 3. Removing Elements

        s1.remove(2);
        System.out.println(s1);

        // 4. Iterating elements

       // s1.iterator().forEachRemaining(System.out::println);

        s1.iterator().forEachRemaining(result -> System.out.print(result + " "));

        System.out.println();
        System.out.println(s1.isEmpty());

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        boolean b = s2.containsAll(s1);
        System.out.println(b);

        // Set toArray() Method in Java

        Integer[] arr = s2.toArray(new Integer[0]);
        // String[] myArray = mySet.toArray(String[]::new);

        for(Integer i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(s2.size());

        s1.retainAll(s2);
        System.out.println(s1);


    }
}
