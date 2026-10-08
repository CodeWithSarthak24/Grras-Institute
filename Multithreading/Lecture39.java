package Multithreading;

// ThreadPoolExecutor

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Lecture39 {
    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        poolExecutor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        poolExecutor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        poolExecutor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        int count = poolExecutor.getActiveCount(); // Returns the number of worker threads currently executing tasks.
        System.out.println(count);


        BlockingQueue<Runnable> blockingQueue = poolExecutor.getQueue();  // Returns the number of tasks waiting in the queue.
        System.out.println(blockingQueue);

        int queueSize = poolExecutor.getQueue().size();
        System.out.println(queueSize);
    }
}

/*

ThreadPoolExecutor is the class that manages the thread pool.
We typecast the ExecutorService reference to ThreadPoolExecutor when we need specific methods such as getActiveCount() and getQueue().size().

ExecutorService (interface)
        ↑
        │ implements
        │
ThreadPoolExecutor (class)

 */