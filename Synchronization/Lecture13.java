package Synchronization;

// Suppose:
// Thread-0 → does the work using object l
// Main → waits on object l
// Thread-1 → does NOT wait on l
// Then notify() only affects threads waiting on l.

public class Lecture13 {
    int data;

    public synchronized void print(){
        data = 100 * 10;
        notify();
    }

    public static void main(String[] args) {

        Lecture13 l = new Lecture13();

        // Thread-0
        Runnable r = l::print;
        Thread t = new Thread(r);
        t.start();

        // Thread-1
        Runnable r2 = ()->{
            System.out.println("I'm going to done my own work");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        // Main-0
        synchronized (l){
            try {
                System.out.println("Waiting for data");
                l.wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(l.data);
        }
    }
}
