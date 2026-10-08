package CollectionFramework.Lists;

// Linked List

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lecture13 {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        ListIterator<Integer> it = l1.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        while(it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
        System.out.println();

        // Create a LinkedList and insert 100 after every even number using a ListIterator.

        LinkedList<Integer> l2 = new LinkedList(Arrays.asList(10,11,23,78));

        ListIterator<Integer> it2 = l2.listIterator();
        while (it2.hasNext()) {
           int number = it2.next();
           if (number % 2 == 0){
               it2.add(100);
           }
        }

        for(Integer x : l2){
            System.out.print(x + " ");
        }
    }
}
