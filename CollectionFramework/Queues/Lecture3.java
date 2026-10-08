package CollectionFramework.Queues;

// PriorityQueue in Java

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lecture3 {
    public static void main(String[] args) {

        // PriorityQueue(Comparator<E> comparator)

        Comparator<Integer> c = (a,b) -> b - a;

        PriorityQueue<Integer> pq = new PriorityQueue<>(c);
        pq.offer(11);
        pq.offer(12);
        pq.offer(14);
        pq.offer(13);

        // pq.iterator().forEachRemaining(System.out::println); not follow priority

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // PriorityQueue(int initialCapacity, Comparator<E> comparator)

        PriorityQueue<Integer> pq2 =
                new PriorityQueue<>(12, Comparator.comparing(Integer::intValue));

        pq2.add(11);
        pq2.add(12);
        pq2.add(13);
        pq2.add(14);

        System.out.println("......");

        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }

        // Adding, Removing, Accessing and Iterating the PriorityQueue

        PriorityQueue<Integer> pq3 = new PriorityQueue<>();

        pq3.add(11);
        pq3.add(12);
        pq3.add(13);
        pq3.add(14);

        System.out.println("Peek : " + pq3.peek());
        System.out.println("Poll : " + pq3.poll());
        System.out.println("Peek : " + pq3.offer(13));
        System.out.println("Element : " + pq3.element());
        System.out.println("Empty : " + pq3.isEmpty());
        System.out.println("Hashcode : " + pq3.hashCode());
        System.out.println("Size : " + pq3.size());
        System.out.println("Equal : " + pq3.equals(10));

    }
}

/*

public class Main {
    public static void main(String[] args) {

        Integer x = 10;
        // Here x is an Integer object containing the value 10.

        // Normal method call
        int value1 = x.intValue();

        System.out.println(value1); // 10


        What is intValue()?
        intValue() is a method of the Integer class.
        It converts/returns the value of the Integer object as a primitive int.
    }
}

 */
