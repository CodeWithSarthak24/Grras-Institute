package Synchronization;

// Synchronization block current class

public class Lecture6 {
    public void traverse() {

        synchronized (Lecture6.class) {
            for (int i = 0; i < 8; i++) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {

        Lecture6 l1 = new Lecture6();
        Lecture6 l2 = new Lecture6();

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
