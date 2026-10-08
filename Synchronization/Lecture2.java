package Synchronization;

// Synchronization method
// Creating single obj with multiple thread which was trying to access synchronization method and each thread were using same obj ref.
// It means they were using same object lock so one thread has to wait for another thread to complete its task.

public class Lecture2 {

    public synchronized void traverse() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Lecture2 l = new Lecture2();

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
/*

class Counter {

    synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class Main {
    public static void main(String[] args) {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> c.increment(), "Thread 1");
        Thread t2 = new Thread(() -> c.increment(), "Thread 2");

        t1.start();
        t2.start();
    }
}

What happens?

Both threads use the same object c:

Thread 1 → gets c's lock → executes increment()
Thread 2 → waits ⏳


Thread 1 → releases lock
Thread 2 → gets c's lock → executes increment()

Because increment() is synchronized, only one thread can execute it at a time on object c.

 */