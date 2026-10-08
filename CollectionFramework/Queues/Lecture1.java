package CollectionFramework.Queues;

// Queue Interface In Java

import java.util.*;

public class Lecture1 {
    public static void main(String[] args) {

        // 1. Adding, Removing, Accessing elements, and Iterating the Queue

        Queue<String> q1  = new LinkedList<>();
        q1.add("b");
        q1.add("a");
        q1.add("a");
        q1.add("d");
        q1.add("e");
        q1.add("c");
        q1.add(null);

        q1.remove("c");
        System.out.println("Access head : " + q1.element());

        q1.iterator().forEachRemaining(System.out::println);
        System.out.println();
        // Methods of Queue Interface

        // ArrayBlockingQueue is a fixed-size (bounded) array
        // ArrayDeque is a resizable (unbounded) array

        Queue<Integer> q2  = new ArrayDeque<>();
        q2.add(11);
        q2.add(12);
        q2.add(11);
        q2.add(14);
        q2.add(15);
        q2.add(12);
        q2.add(17);

        System.out.println("Here is it......");
        System.out.println("Offer : " + q2.offer(19));
        System.out.println("Add : " + q2.add(18));
        System.out.println("Remove : " + q2.remove(12));
        System.out.println("Poll : " + q2.poll());
        System.out.println("Peek : " + q2.peek());
        System.out.println("Empty : " + q2.isEmpty());
        System.out.println("Contain : " + q2.contains(23));

      // Integer[] arr = q1.toArray(new Integer[0]);
        String[] arr = q1.toArray(String[]::new);

        System.out.println("Array...");
        for(String i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        // (Deque only) method:
        System.out.println("Some deque specific method: ");

        Deque<String> q3 = new ArrayDeque<>();
        q3.add("b");
        q3.add("a");
        q3.add("a");
        q3.add("d");
        q3.add("e");
        q3.offer("f");

        System.out.println("Before any change : ");
        q3.iterator().forEachRemaining(System.out::println);

        q3.addFirst("Ai");
        q3.addLast("Dz");
        boolean b1 = q3.offerFirst("Lx");
        boolean b2 = q3.offerLast("Pr");

        System.out.println("After any change : " + q3);

        q3.removeFirst();
        q3.removeLast();

        System.out.println("After remove : " + q3);

        q3.pollFirst();
        q3.pollLast();

        System.out.println("After poll : " + q3);

        System.out.println("Peek First : " + q3.peekFirst());

        System.out.println("Peek Last : " + q3.peekLast());

        System.out.println("After peek : " + q3);

        System.out.println("Get first : " + q3.getFirst());

        System.out.println("Get last : " + q3.getLast());


    }
}
