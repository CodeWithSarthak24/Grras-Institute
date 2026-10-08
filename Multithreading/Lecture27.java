package Multithreading;

// Thread pool

// Create a thread pool with 2 threads.
// Submit 5 tasks using execute().

// Each task should:

// Print which task is running.
// Print the current thread name.
// Sleep for 1 second.
// Print when the task finishes.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture27 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute( () ->{

            System.out.println("Task 1 is running.........");
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Task 1 is finished.........");
          }
        );

        pool.execute( () ->{

                    System.out.println("Task 2 is running.........");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
            System.out.println("Task 2 is finished.........");
                }
        );

        pool.execute( () ->{

                    System.out.println("Task 3 is running.........");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
            System.out.println("Task 3 is finished.........");
                }
        );

        pool.execute( () ->{

                    System.out.println("Task 4 is running.........");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
            System.out.println("Task 4 is finished.........");
                }
        );

        pool.execute( () ->{

                    System.out.println("Task 5 is running.........");
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
            System.out.println("Task 5 is finished.........");
                }
        );

        pool.shutdown();
    }
}

// pool-1 → identifies the thread pool
// thread-1 → identifies the worker thread inside that pool