package Multithreading;

// Priority method

public class Lecture13 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        Lecture13 l1 = new Lecture13();
        Lecture13 l2 = new Lecture13();
        Lecture13 l3 = new Lecture13();
        Lecture13 l4 = new Lecture13();

        l1.setPriority(1);
        l2.setPriority(9);
        l3.setPriority(10);
        l4.setPriority(8);

        l1.start();
        l2.start();
        l3.start();
        l4.start();
    }
}
