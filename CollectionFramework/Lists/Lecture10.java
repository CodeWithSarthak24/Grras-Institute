package CollectionFramework.Lists;

// Arraylist

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Lecture10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        list.set(0, "d");
        boolean b  = list.contains("s");
        System.out.print(b);

        System.out.println();

         ArrayList<String> newList = (ArrayList<String>) list.clone();

         for (String s : newList){
             System.out.print(s + " ");
         }
         System.out.println();

         ArrayList<String> arr = new ArrayList<>(29);  // capacity = 29, size = 0

         arr.add("d");  // capacity = 29, size = 1
         System.out.print(list.containsAll(arr));
         arr.trimToSize();  // capacity = 1, size = 1

         System.out.println();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "x", "c"));

         list1.retainAll(list2); // compare list1 with list2
         System.out.println(list1);
         System.out.println(list2);

         System.out.println(list2.subList(0,1));
         System.out.println(list.getFirst());

        Collections.sort(list2);

        for (String s : list2){
            System.out.print(s + " ");
        }
        System.out.println();

        // FOR EACH LOOP.....

       list2.forEach(ans -> System.out.print(ans + " : "));

        Iterator<String> iterator = list2.iterator();
        System.out.println();

       // ITERATOR.....

      /*  while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
      */

       // FOR EACH REMAINING.....

       iterator.forEachRemaining(result -> System.out.print(result + " + "));
    }
}
