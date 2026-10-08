package Multithreading;

// awaitTermination():

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Lecture38 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.execute(() -> {

            try {
                System.out.println("Task 1 started......");
                Thread.sleep(1000);
                System.out.println("Task 1 finished.....");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        pool.execute(() -> {
            System.out.println("Task 2 started....");
            System.out.println("Task 2 finished....");
        });

        System.out.println(pool.isTerminated());

        pool.shutdown();

    /*    pool.execute(() -> {
            System.out.println("Task 3 started");
        });
*/
        try{
            pool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Main finished");
        System.out.println(pool.isTerminated());  // true
    }
}


/*
awaitTermination() : It allows your main thread to wait for the thread pool to finish its already-submitted tasks before the program continues.
It is normally used after shutdown().

"shutdown() is used to stop accepting new tasks while allowing already submitted tasks to complete. It does not make the calling thread wait.
awaitTermination() is used when we need to wait for the thread pool to finish its existing tasks before continuing, for a maximum specified time."

------------------
pool.shutdown();

Stops accepting new tasks.
Existing tasks continue running.
Main thread does NOT wait.
Main thread immediately executes the next line.
---------------------
pool.awaitTermination(5, TimeUnit.SECONDS);

Main thread waits for the pool to terminate.
It waits up to 5 seconds.
If the pool finishes earlier, main continues earlier.
If 5 seconds pass, main continues even if the pool hasn't terminated.

*/