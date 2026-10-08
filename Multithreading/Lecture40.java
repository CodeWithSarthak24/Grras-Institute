package Multithreading;

//  callable interface

import java.util.concurrent.*;

public class Lecture40 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> callable =  () ->{
            System.out.println("Start");
            Thread.sleep(1000);
            return 10 * 10;
        };

        Future<Integer> f = executorService.submit(callable);
        try {
            System.out.println(f.get());
        }catch (ExecutionException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
/*

Runnable → no return value, checked exceptions must be handled inside.
Callable → returns a value, checked exceptions can be propagated to the caller.



 */