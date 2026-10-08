package Multithreading;

// Thread pool

// Create a thread pool with 3 threads using Executors.newFixedThreadPool(3). Submit 5 tasks using execute().

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture26 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute( () ->
            System.out.println("Task 1 is running.....")
        );

        pool.execute( () ->
                    System.out.println("Task 2 is running.....")
        );

        pool.execute( () ->
                    System.out.println("Task 3 is running.....")
        );

        pool.execute( () ->
                    System.out.println("Task 4 is running.....")
        );


        pool.execute( () ->
                    System.out.println("Task 5 is running.....")
        );

        pool.shutdown();
    }
}

/*
-------------
Statement lambda:

   pool.execute( () -> {
                    System.out.println("Task 3 is running.....");
                }
        );
--------------
Expression lambda:

pool.execute( () ->
                    System.out.println("Task 4 is running.....")
        );
--------------
 */