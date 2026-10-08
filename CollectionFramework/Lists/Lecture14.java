package CollectionFramework.Lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lecture14 {
    public static void main(String[] args) {

        // LinkedList<Integer> l1 = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList<Integer> l1 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Method:

        // peek(): This method retrieves but does not remove, the head (first element) of this list.
        System.out.println(l1.peek());

        // poll():This method retrieves and removes the head (first element) of this list.
        System.out.println(l1.poll());
        l1.forEach(ans -> System.out.print(ans + " "));
        System.out.println();

         LinkedList<Integer> l2 = new LinkedList<>(List.of(1, 2, 3, 4, 5));

         Integer[] arr = l2.toArray(new Integer[0]);

         for (Integer i : arr) {
             System.out.print(i + " ");
         }
        System.out.println();

         LinkedList<Integer> l3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
         String s = l3.toString();
        System.out.println(s);


    }
}

/*
  Here, I create a LinkedList object and initialize it with the elements returned by Arrays.asList().
         or Arrays.asList() converts the given elements or an array into a List. Here, it creates a List,
         which is then passed to the LinkedList constructor to initialize the LinkedList with those elements.
         It converts an object's data into a readable String representation.
 */