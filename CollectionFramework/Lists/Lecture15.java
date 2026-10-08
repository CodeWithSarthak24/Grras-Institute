package CollectionFramework.Lists;

// Vector

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class Lecture15 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("x");
        vector.add("c");
        System.out.println(vector);

        Vector<String> vector2 = new Vector<>(Arrays.asList("a", "x", "c"));
        System.out.println(vector2.capacity()); // by default capacity is 10
        System.out.println(vector2.size());
        System.out.println(vector2.get(0));
        vector2.ensureCapacity(89);
        System.out.println(vector2.capacity());

        Vector<String> newVector = ( Vector<String>)vector2.clone();

       ListIterator<String> ls = newVector.listIterator();
       while (ls.hasNext()) {
           System.out.print(ls.next() + " ");
       }
    }
}
