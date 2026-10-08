package Multithreading;

// Thread pool
// future.cancel()
// condition 2

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture33 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        Future<?> f = pool.submit(() -> {
            System.out.println("Task A is running....... "+  Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Task A is end....... ");
        });

        Future<?> f2 =  pool.submit(() ->
                System.out.println("Task B is running....... " +  Thread.currentThread().getName())
        );

        f.cancel(true);
    }
}

/*

Condition 2: Task has NOT started

The task is still in the queue:

Worker → Task 1 (running)

Task 2 → Queue

Then:

future2.cancel(true);

Flow:

Task 2 → Queue
          ↓
       cancel()
          ↓
    Task 2 cancelled
          ↓
    Task 2 never executes

No InterruptedException occurs because Task 2's code never started executing.

Final output:

Started -> waiting → interrupt → InterruptedException can occur.
Not started + in queue → cancelled → task does not execute.

 */