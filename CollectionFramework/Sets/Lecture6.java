package CollectionFramework.Sets;

// NavigableSet in Java

import java.util.NavigableSet;
import java.util.TreeSet;

public class Lecture6 {
    public static void main(String[] args) {

        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(10);
        ns.add(11);
        ns.add(21);
        ns.add(13);
        ns.add(41);

        System.out.println("NavigableSet : " + ns);

        // Get a reverse view of the navigable set

        NavigableSet<Integer> reverse = ns.descendingSet();

        System.out.println("Reverse : " + reverse);

        System.out.println("pollFirst : " + ns.pollFirst());

        System.out.println("pollLast : " + ns.pollLast());

        System.out.println("Lower of 10 : " + ns.lower(10));

        System.out.println("Lower of 14 : " + ns.lower(14));

        System.out.println("Higher of 14 : " + ns.higher(14));

        System.out.println("Ceiling of 11 : " + ns.ceiling(11));

        System.out.println("Ceiling of 16 : " + ns.ceiling(16));

        System.out.println("Floor of 11 : " + ns.floor(11));

        System.out.println("Floor of 19 : " + ns.floor(19));

        System.out.println("First element : " + ns.first());

        System.out.println("Last element : " + ns.last());

        NavigableSet<Integer> ns2 = ns.tailSet(11,true);
        System.out.println("Tail set : " + ns2);

        // tailSet() : Give me the elements from this value toward the end."
    }
}
