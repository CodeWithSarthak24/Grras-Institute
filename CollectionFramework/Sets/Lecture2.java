package CollectionFramework.Sets;
import java.util.HashSet;
import java.util.Iterator;

// HashSet in Java

public class Lecture2 {
    public static void main(String[] args) {

        // HashSet(int initialCapacity, float loadFactor)

        HashSet<Integer> hs1 = new HashSet<>(10,0.6f);

        // 1. Adding, Removing, Iterating Elements in HashSet

        hs1.add(10);
        hs1.add(10);
        hs1.add(11);

        System.out.println(hs1.size());
        System.out.println(hs1.contains(10));
        System.out.println(hs1);
        System.out.println(hs1.remove(10));
        System.out.println(hs1);
        System.out.println(hs1.isEmpty());
        hs1.add(19);
        hs1.add(29);

        hs1.iterator().forEachRemaining(System.out::println);

        HashSet<Integer> hs2 = new HashSet<>();

        hs2.add(100);
        hs2.add(101);
        hs2.add(102);

        hs1.addAll(hs2);

        Iterator<Integer> itr = hs2.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----");

        hs1.iterator().forEachRemaining(System.out::println);


    }
}
