package Multithreading;

// Thread pool

// Create a thread pool with 3 threads.
// Submit 5 tasks using submit().

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture28 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future<?> f = pool.submit( () ->
            System.out.println("Task 1 is running.....")
        );

        Future<?> f2 = pool.submit( () ->
                System.out.println("Task 2 is running.....")
        );

        Future<?> f3 = pool.submit( () ->
                System.out.println("Task 3 is running.....")
        );

        Future<?> f4 = pool.submit( () ->
                System.out.println("Task 4 is running.....")
        );

        Future<?> f5 = pool.submit( () ->
                System.out.println("Task 5 is running.....")
        );

        pool.shutdown();
    }
}
