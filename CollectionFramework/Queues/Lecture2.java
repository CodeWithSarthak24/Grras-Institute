package CollectionFramework.Queues;

// ArrayDeque in Java

import java.util.ArrayDeque;
import java.util.Iterator;

public class Lecture2 {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>(10);

        System.out.println("Size : " + queue.size());
        System.out.println("Empty : " + queue.isEmpty());

        // Adding, Accessing, Removing, and Iterating element

        queue.add(10);
        queue.add(20);
        queue.add(10);
        queue.add(40);

        System.out.println("Queue element : " + queue);

        System.out.println("Adding at front : " + queue.offerFirst(100));
        System.out.println("Adding at rear : " + queue.offerLast(200));

        System.out.println("Removing from front : " + queue.pollFirst());
        System.out.println("Removing from rear : " + queue.pollLast());

        System.out.println("Getting from front : " + queue.getFirst());
        System.out.println("Element : " + queue.element());
        System.out.println("Peeking from front : " + queue.peekFirst());
        System.out.println("Peeking from rear : " + queue.peekLast());
        System.out.println(queue);

        ArrayDeque<Integer> queue2 = new ArrayDeque<>(10);

        queue2.add(100);
        queue2.add(200);
        queue2.add(100);
        queue2.add(400);

        System.out.println("Queue2 element : " + queue2);

        System.out.println("Pop : " + queue2.pop());

        queue2.push(700);

        System.out.println("Peek : " + queue2.peek());

        System.out.println("Queue2 element : " + queue2);

        Integer[] array = queue2.toArray(Integer[]::new);

        System.out.println("Array element");
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayDeque<Integer> queue3 = new ArrayDeque<>(10);

        queue3.add(110);
        queue3.add(210);
        queue3.add(310);
        queue3.add(410);

      Iterator<Integer> reverse = queue3.descendingIterator();

        reverse.forEachRemaining(System.out::println);



    }
}
