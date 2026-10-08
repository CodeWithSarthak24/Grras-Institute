package Multithreading;

// Priority method : The method throws IllegalArgumentException if the value newPriority goes out of the range, which is 1 (min) to 10 (max).

public class Lecture15 {
    public static void main(String[] args) {

        Runnable r = () -> {
            Thread.currentThread().setPriority(54);
            int a = Thread.currentThread().getPriority();
            System.out.println(a);
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}
