package Multithreading;

// Thread pool
// shutdownNow():

// 👉 Attempt to stop immediately
// No new tasks accepted.
// Attempts to interrupt currently running tasks.
// Tasks waiting in the queue are returned and will not execute.

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture34 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.execute(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("Task 1 finished");
            } catch (InterruptedException e) {
                System.out.println("Task 1 interrupted");
            }
        });

        pool.execute(() -> {
            System.out.println("Task 2 finished");
        });

        pool.execute(() -> {
            System.out.println("Task 3 finished");
        });

       List<Runnable> run = pool.shutdownNow();

       for(Runnable result : run){
           result.run(); // run() manually executes those returned tasks in the main thread.
       }
    }
}

/*

ExecutorService pool = Executors.newFixedThreadPool(1);

pool.execute(() -> {
    try {
        Thread.sleep(10000);
        System.out.println("Task 1 finished");
    } catch (InterruptedException e) {
        System.out.println("Task 1 interrupted");
    }
});

pool.execute(() -> {
    System.out.println("Task 2 finished");
});

List<Runnable> waitingTasks = pool.shutdownNow(); // shutdownNow() returns the tasks that were waiting in the queue and had not started yet.


Flow:

1 Worker

Task 1 → Running → sleep()
Task 2 → Queue

        ↓
shutdownNow()

Task 1 → Interrupted
Task 2 → Removed from queue
--------------
Why do we use Runnable in List<Runnable>, not Thread. Let's make it very simple.

-> They are not returning the threads; they are returning the tasks that were waiting in the queue. That's why Runnable is used instead of Thread,
because Runnable represents a task that is ready to be executed by a worker thread.
------------

 */