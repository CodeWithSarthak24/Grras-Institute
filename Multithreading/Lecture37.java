package Multithreading;

// Thread pool
// awaitTermination()

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture37 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        pool.execute(() -> {
            try {
                Thread.sleep(1000);  // Task is still running
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        pool.shutdown();  // Start shutdown
        try {
            pool.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
            // "Wait up to 5 seconds for all running tasks to finish and the pool to terminate."
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(pool.isTerminated()); // false
    }
}

/*

ExecutorService pool
        ↓
Create 1 worker thread
        ↓
pool.execute()
        ↓
Task starts
        ↓
Thread.sleep(1000)
        ↓
pool.shutdown()
        ↓
No new tasks accepted
        ↓
Existing Task continues
        ↓
1 second passes
        ↓
Task finishes
        ↓
Thread pool terminates
        ↓
awaitTermination(5 seconds)
        ↓
Pool has already terminated
        ↓
isTerminated()
        ↓
      true

 */