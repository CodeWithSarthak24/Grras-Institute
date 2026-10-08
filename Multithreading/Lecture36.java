package Multithreading;

// Thread pool
// isTerminated()

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture36 {
    public static void main(String[] args)  {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.execute(() -> {
            try {
                Thread.sleep(3000);  // Task is still running
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println(pool.isTerminated()); // false
    }
}

/*

isTerminated(): checks whether the thread pool has completely stopped.

It becomes true only when:

shutdown()
   ↓
All tasks finish
   ↓
Worker threads stop
   ↓
isTerminated() → true

Here is a simple example showing both false and true.

isTerminated() → false

ExecutorService pool = Executors.newFixedThreadPool(1);

pool.execute(() -> {
    try {
        Thread.sleep(3000);  // Task is still running
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
});

pool.shutdown();

System.out.println(pool.isTerminated());

Output: false

Why? Because the task is still running.

What happens?

Worker Thread
     ↓
Task starts
     ↓
sleep(3 seconds)
     ↓
Task is still running

At the same time, the main thread does:

Main Thread
     ↓
shutdown()
     ↓
isTerminated()

The task has not finished yet, so the pool has not completely stopped.

Therefore: isTerminated() → false

 */