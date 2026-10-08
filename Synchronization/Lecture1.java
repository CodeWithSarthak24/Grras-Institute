package Synchronization;

// Problem without synchronizations

// When two threads try to enter the same synchronized block/method using the same lock, one thread gets the lock and the other thread waits.
// Without synchronized, having the same object/lock does not automatically make a thread wait.

public class Lecture1 {

    public void traverse() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Lecture1 l = new Lecture1();

        Runnable r1 = () -> {
           l.traverse();
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = () -> {
            l.traverse();
        };

        Thread t2 = new Thread(r2);
        t2.start();
    }
}

