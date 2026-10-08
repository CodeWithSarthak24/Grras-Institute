package Multithreading;

// Priority method : Default nature -> Priorities are inherited from parent method

public class Lecture14 extends Thread{

    @Override
    public void run(){
        System.out.println("Current thread priorities : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        System.out.println("Main thread before change : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("Main thread after change : " + Thread.currentThread().getPriority());
        Lecture14 l = new Lecture14();
        l.start();
    }
}
