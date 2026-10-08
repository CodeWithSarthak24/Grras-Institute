package Multithreading;

// Thread pool
// Future

// Create a thread pool with 2 threads.
//Submit a task using submit() that:

// Prints "Calculating..."
// Sleeps for 2 seconds
// Calculates 10 + 20
// Returns the result.


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lecture30 {
    public static void main(String[] args) throws  InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(2);

     Future<Integer> f = pool.submit( () -> {

            System.out.println("Calculating is going...");

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            int a = 10, b = 30;
              return a + b;
           }
        );
        System.out.println(f.get());
        pool.shutdown();

    }
}

/*

1. First InterruptedException — sleep()

Inside your task:

try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // handled here
}

This means: Worker thread is sleeping → someone interrupts the worker thread → sleep() throws InterruptedException.
You have already handled that exception.
----------------------
2. Second InterruptedException — get()

Later:

f.get();

Here, a different thread is involved.

The main thread is saying: "I will wait here until the worker finishes."
If the main thread itself gets interrupted while waiting, then get() throws another InterruptedException.
------------------------
And ExecutionException?

get() has another possible problem:

f.get()
  ↓
Task failed
  ↓
ExecutionException

So get() requires you to deal with:

InterruptedException
ExecutionException

That's why you wrote:

public static void main(String[] args)
        throws ExecutionException, InterruptedException
 */