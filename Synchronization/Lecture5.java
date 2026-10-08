package Synchronization;

// Synchronization block using this
// using 'this' cause problem because we apply lock on current obj and there are two obj which mean two different lock

public class Lecture5 {
    public void traverse() {

        synchronized (this) {
            for (int i = 0; i < 8; i++) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {

        Lecture5 l1 = new Lecture5();
        Lecture5 l2 = new Lecture5();

        Runnable r1 = () -> {
            l1.traverse();
        };

        Runnable r2 = () -> {
            l1.traverse();
        };

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
