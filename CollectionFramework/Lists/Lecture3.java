package CollectionFramework.Lists;

// Iterator interface
// Problem: Here, we will use an Iterator to traverse and remove odd elements from an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Lecture3 {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 != 0) {
                it.remove();
            }
        }
        System.out.println(collection);
    }
}
