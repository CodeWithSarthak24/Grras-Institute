package Multithreading;

// Example: Single Task Using Multiple Threads (Extending Thread)

public class Lecture23 extends Thread{

    Lecture23(String msg){
        super(msg);
    }

    @Override
    public void run() {
        System.out.println("Performing task " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture23 l1 = new Lecture23("UX-1");
        Lecture23 l2 = new Lecture23("UX-2");
        Lecture23 l3 = new Lecture23("UX-3");

        l1.start();
        l2.start();
        l3.start();
    }
}
