package Synchronization;

// static Synchronization method
// I have two obj with multiple thread and each obj has different lock but, I have uses the static synchronization method so that it provide lock at
// class level and I have 1 Lecture1 class so lock will be 1. Now, each thread of different object will access same lock so one has to wait
// for every obj of that class will have same lock

public class Lecture4 {
    public static synchronized void traverse() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Lecture4 l1 = new Lecture4();
        Lecture4 l2 = new Lecture4();

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
