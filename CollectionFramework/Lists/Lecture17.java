package CollectionFramework.Lists;

// spliterator

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Lecture17 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Spliterator<Integer> sp = list.spliterator();

       // sp.tryAdvance(System.out::println);
       // sp.tryAdvance(System.out::println);

        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        Spliterator<Integer> sp1 = list1.spliterator();
        Spliterator<Integer> second = sp1.trySplit();

        second.forEachRemaining(System.out::println);
        System.out.println("---------");
        sp1.forEachRemaining(System.out::println);




    }
}

/*

Example:

List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
Spliterator<Integer> spliterator = list.spliterator();
Spliterator<Integer> second = spliterator.trySplit();

Conceptually, the data may be divided like this:

Original: [10, 20, 30, 40, 50, 60]

       		↓ trySplit()

second: [10, 20, 30]

original spliterator:[40, 50, 60]

Now we can process both parts separately:

second.forEachRemaining(System.out::println); // 10,20,30

spliterator.forEachRemaining(System.out::println); // 40 50 60
------------------------------------------------------------------------

 */
