package Multithreading;

// currentThread()

public class Lecture7 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Task started....");
    }

    public static void main(String[] args) {

        Lecture7 l = new Lecture7();
        l.start();

        System.out.println(Thread.currentThread().getName());
    }
}
