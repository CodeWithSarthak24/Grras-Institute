package CollectionFramework.Sets;

// SortedSet Interface in Java

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lecture7 {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(11);
        set.add(12);
        set.add(13);
        set.add(11);
        set.add(10);
        set.add(9);
        set.remove(9);

        set.iterator().forEachRemaining(System.out::println);

        set.removeFirst();
        set.removeLast();

        set.iterator().forEachRemaining
                (r -> System.out.println("After modification: " + r));

        boolean result = set.contains(9);
        System.out.println(result);

        System.out.println("First value : " + set.first());
        System.out.println("Last value : " + set.last());

        set.add(21);
        set.add(22);

        set.iterator().forEachRemaining(r -> System.out.println(r));

        SortedSet<Integer> set1 = set.tailSet(12); // by default is true

        System.out.println("Tail set : ");
        for (Integer i : set1) {
            System.out.println(i);
        }

        // SortedSet subSet() method in Java

        System.out.println("subSet : " + set.subSet(12,22));

        // SortedSet headSet() method in Java

        System.out.println("Elements strictly less than 7 in set are : " + set.headSet(19));

        // TreeSet comparator() Method in Java

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(121);
        set2.add(122);
        set2.add(123);
        set2.add(124);

        System.out.println(set2.comparator());
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<>(Comparator.reverseOrder());
        set3.add(121);
        set3.add(122);
        set3.add(123);
        set3.add(124);

        System.out.println(set3.comparator());
        System.out.println(set3);

        // When you call treeSet.comparator(), it will only ever give you one of two answers:
        // 1) null: This means the TreeSet is using Natural Ordering.
        // (for numbers, this means 1, 2, 3...; and for text, it means Alphabetical A, B, C...).
        // 2) Custom Rule (Comparator): This means you manually gave the TreeSet a special rule
        // when you created it (for example, "sort numbers backwards" or "sort text by length").
    }
}
