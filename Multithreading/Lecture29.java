package Multithreading;

// Thread pool

// Create a thread pool with 2 threads.
// Submit 5 tasks using submit().

// Each task should:

// Print "Task X is running...".
// Print the current thread name.
// Sleep for 1 second.
// Print "Task X is finished...".

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture29 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        Future<?> f = pool.submit( () -> {

            System.out.println("Task 1 is running.....");
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Task 1 is end.....");
           }
        );

        Future<?> f2 = pool.submit( () -> {

                    System.out.println("Task 2 is running.....");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Task 2 is end.....");
                }
        );

        Future<?> f3 = pool.submit( () -> {

                    System.out.println("Task 3 is running.....");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Task 3 is end.....");
                }
        );

        Future<?> f4 = pool.submit( () -> {

                    System.out.println("Task 4 is running.....");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Task 4 is end.....");
                }
        );

        Future<?> f5 = pool.submit( () -> {

                    System.out.println("Task 5 is running.....");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Task 5 is end.....");
                }
        );

        pool.shutdown();

    }
}
