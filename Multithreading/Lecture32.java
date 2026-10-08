package Multithreading;

// Thread pool
// future.cancel()
// condition 1

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture32 {
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

        f2.cancel(true);
    }
}

/*

Condition 1: Task has started and is in a waiting/blocking state

For example, the task is executing:

Thread.sleep(10000);

Flow:

Task starts
   ↓
sleep()
   ↓
TIMED_WAITING
   ↓
future.cancel(true)
   ↓
Thread is interrupted
   ↓
sleep() throws InterruptedException

So you can say: If the task has started and its thread is in an interruptible waiting/blocking state such as sleep(),
 cancel(true) interrupts the thread, and the blocking method can throw InterruptedException.

 */