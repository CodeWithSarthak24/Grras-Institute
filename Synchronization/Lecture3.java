package Synchronization;

// Problem with synchronizations method
// if we create multiple object then each object will have different lock and suppose each object has multiple thread then,
// Thread-0 of obj 1 will have lock1 and Thread-1 of obj 2 will have lock2. Now each thread has different lock so it will access the synchronized
// method at same time

public class Lecture3 {

    public synchronized void traverse() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Lecture3 l1 = new Lecture3();
        Lecture3 l2 = new Lecture3();

        Runnable r1 = () -> {
            l1.traverse();
        };

        Runnable r2 = () -> {
            l1.traverse();
        };

        // Runnable r1 = l1::traverse;  //  Lambda can be replaced with method reference


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Runnable r3 = () -> {
            l2.traverse();
        };

        Runnable r4 = () -> {
            l2.traverse();
        };

        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);

        t3.start();
        t4.start();

    }
}
