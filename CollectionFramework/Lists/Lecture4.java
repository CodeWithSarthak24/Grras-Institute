package CollectionFramework.Lists;

// ListIterator interface
// Traverse Backward

import java.util.*;

public class Lecture4 {
    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        ListIterator<Integer> it = c.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        while(it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }

    }
}
