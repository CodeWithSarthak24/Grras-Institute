package CollectionFramework.Sets;

// LinkedHashSet in Java

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Lecture3 {
    public static void main(String[] args) {

        // 1. Adding, Removing, Iterating Elements in LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(21,0.4f);
        linkedHashSet.add(11);
        linkedHashSet.add(31);
        linkedHashSet.add(13);
        linkedHashSet.add(12);
        linkedHashSet.add(12);

        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.contains(11));

        System.out.println(linkedHashSet.removeFirst());

        linkedHashSet.iterator().forEachRemaining
                (result -> System.out.println("List : " + result));

        // 2. toArray() and toString() method

        Integer[] array = linkedHashSet.toArray(Integer[]::new);

        for (Integer res : array) {
            System.out.println(res);
        }

        System.out.println(Arrays.toString(array));


    }
}
