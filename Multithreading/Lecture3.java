package Multithreading;

// Thread Schedular

public class Lecture3 extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture3 l1 = new Lecture3();
        Lecture3 l2 = new Lecture3();
        Lecture3 l3 = new Lecture3();
        Lecture3 l4 = new Lecture3();

        l1.start();
        l2.start();
        l3.start();
        l4.start();
    }
}
