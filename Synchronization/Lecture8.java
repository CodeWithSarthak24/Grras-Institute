package Synchronization;

// static method has synchronization block

public class Lecture8 {

    public static void print(){
        synchronized (Lecture8.class){
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
        }
        for (int i = 6; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        Lecture8 l  = new Lecture8();

        Thread t1 = new Thread(Lecture8::print);
        t1.start();

        Thread t2 = new Thread(Lecture8::print);
        t2.start();

        //  Runnable r1 = Lecture8::print; // because we are calling from static method
        // Thread t1 = new Thread(r1);
        // t1.start();

        //  Runnable r2 = Lecture8::print; // because we are calling from static method
        // Thread t2 = new Thread(r2);
        // t2.start();

    }
}

/*

🏃‍♂️ The Step-by-Step Timeline
Step 1: Thread 1 arrives first. It locks Lecture8.class and enters the synchronized block. It prints 1 2 3 4 5 .
Step 2: Thread 2 arrives while Thread 1 is still printing. Thread 2 is blocked (waiting) outside the synchronized block. It cannot enter yet.
Step 3: Thread 1 finishes the first loop and exits the synchronized block. The lock on Lecture8.class is now released.
Step 4: Thread 1 moves on to the unprotected loop (6 to 10).
Step 5: The Switch: At the exact same time Thread 1 is moving to loop 6-10, Thread 2 sees the lock is free.
Thread 2 grabs the lock and enters the synchronized block to print 1 2 3 4 5.🔀 Where the O
 */
