package Multithreading;

// Create a thread pool with 3 threads.
// Submit 3 tasks, where each task performs a different calculation:

// Task 1 → calculate 10 + 20
// Task 2 → calculate 50 × 2
// Task 3 → calculate 100 ÷ 4

// Each task should:

// Print the task name and current thread name.
// Sleep for 2 seconds.
// Return its calculated result.

// Use isDone() to check whether each task has completed.
// Use get() to retrieve all three results.
// Calculate the total of all results.

// Print:
// Task 1 Result = 30
// Task 2 Result = 100
// Task 3 Result = 25
// Total = 155

// Finally call shutdown().

// Important challenge

// Before calling get(), print:
// Checking task status...
// and check:

// future1.isDone()
// future2.isDone()
// future3.isDone()

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture31 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(3);

       Future<Integer> f = pool.submit( () -> {

            System.out.println("Task 1 is running.....");
            System.out.println( Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
               // e.printStackTrace();
                Thread.currentThread().interrupt();
                }

            int ans1 = 10 + 20;
            return ans1;
             }
        );

        Future<Integer> f2 = pool.submit( () -> {

                    System.out.println("Task 2 is running.....");
                    System.out.println( Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e){
                      //  e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }

                    int ans2 = 10 * 20;
                    return ans2;
                }
        );

        Future<Integer> f3 = pool.submit( () -> {

                    System.out.println("Task 3 is running.....");
                    System.out.println( Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e){
                       // e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }

                    int ans3 = 110 - 20;
                    return ans3;
                }
           );

        int result1 = f.get();
        int result2 = f2.get();
        int result3 = f3.get();

        System.out.println("Task 1 Result = " + result1);
        System.out.println("Task 2 Result = " + result2);
        System.out.println("Task 3 Result = " + result3);

        int total = result1 + result2 + result3;

        System.out.println("Total = " + total);

        System.out.println("Task 1 Done = " + f.isDone());
        System.out.println("Task 2 Done = " + f2.isDone());
        System.out.println("Task 3 Done = " + f3.isDone());

        pool.shutdown();
    }
}

/*

If the worker thread is interrupted while sleeping:

try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}

What happens:

Worker thread
     ↓
sleep()
     ↓
Someone interrupts it
     ↓
InterruptedException
     ↓
catch block
     ↓
Thread.currentThread().interrupt()
     ↓
Worker thread's interrupt status = TRUE

-----------------
After the catch block:

catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}

two things have happened:

Exception is handled → it does not go to the caller.
Interrupt status becomes true → the thread remembers that it was interrupted.

Then the thread continues executing the code after the catch block.

Exception
   ↓
catch handles it
   ↓
interrupt status = true
   ↓
code after catch continues
 */