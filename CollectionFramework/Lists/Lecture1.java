package CollectionFramework.Lists;

// Method of collection
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Lecture1 {
    public static void main(String[] args) {

        // Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        System.out.println(c);

        System.out.println(c.size());
        System.out.println(c.remove(2));
        System.out.println(c);
        c.add(34);
        System.out.println(c.removeAll(c));
        System.out.println(c);
        c.add(14);
        c.add(24);
        c.add(34);
        c.add(44);
        c.add(54);
        System.out.println(c);
        c.clear();
        System.out.println(c);

        Collection<Integer> c1 = new ArrayList<>(Arrays.asList(10,21,32,43));
        boolean ans =  c1.addAll(c1);
        System.out.println(c1);

        // What does addAll() do?
        // c1.addAll(collection);
        // means: Add all elements from the given collection into c1.


        System.out.println("Before : " + c1);
        Collection<Integer> x = new ArrayList<>(Arrays.asList(100,300,758));
        // or java 9 version: Collection<Integer> x = new ArrayList<>(List.of(100, 300, 758));
        boolean result = c1.addAll(x);
        System.out.println("After addAll : " + c1);

        // c1.iterator().forEachRemaining(System.out::println);
        // iterator()           → creates an iterator
        // forEachRemaining()   → goes through remaining elements
        // System.out::println  → prints each element
        // Use it when you simply want to process all remaining elements.


          Iterator<Integer> it = c1.iterator();
          while (it.hasNext()) {
              int res = it.next();
              if(res < 100){
                  System.out.print(res + " ");
              }
              System.out.println();
          }

          // Use it when you need conditions, complex logic, or removal

        Collection<String> cs = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

          // cs.iterator().forEachRemaining(System.out::println);
          cs.iterator().forEachRemaining(output -> System.out.print(output + " "));

    }
}



