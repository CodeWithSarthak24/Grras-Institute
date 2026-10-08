package CollectionFramework.Sets;

// TreeSet in java

import java.util.TreeSet;

public class Lecture4 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. Adding, Removing, Iterator Elements and many more.....

        treeSet.add(1);
        treeSet.add(111);
        treeSet.add(11);
        treeSet.add(1111);
        treeSet.add(1111);

        treeSet.iterator().forEachRemaining(System.out::println);

        System.out.println("Size " + treeSet.size());
        System.out.println("First Element " + treeSet.first());
        System.out.println("Second Element " + treeSet.last());

        Integer value = 59;
        // Find the values just greater and smaller than the value

        System.out.println("Higher " +  treeSet.higher(value));
        System.out.println("Lower " + treeSet.lower(value));

        // Now removing the first, Last element using pollFirst()

        System.out.println("Poll First " + treeSet.pollFirst());

        System.out.println("Poll Last " + treeSet.pollLast());

        treeSet.iterator().forEachRemaining(System.out::println);

        // TreeSet ceiling() method
        // It is used to return the least element in this set greater than or equal to the given element,
        // or null if there is no such element.

        // Case 1: The exact element exists in the set
        // It returns the element itself (since it is equal)

        System.out.println("Ceiling of 11 :  " + treeSet.ceiling(11));


        // Case 2: The element does not exist in the set
        // It returns the next closest higher value

        System.out.println("Ceiling of 100 :  " + treeSet.ceiling(100));

        // In case of null

       // System.out.println("Ceiling of null :  " + treeSet.ceiling(null));

        // TreeSet floor() method

        System.out.println("Floor of 111 :  " + treeSet.floor(111));
        System.out.println("Floor of 100 :  " + treeSet.floor(100));
    }
}
