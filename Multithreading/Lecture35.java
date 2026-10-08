package Multithreading;

// Thread pool
// isShutdown()

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lecture35 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);
        System.out.println(pool.isShutdown());
        pool.shutdown();
        System.out.println(pool.isShutdown());
    }
}

/*

Example:

ExecutorService pool =  Executors.newFixedThreadPool(2);
System.out.println(pool.isShutdown());
pool.shutdown();
System.out.println(pool.isShutdown());

Output:

false
true

 */