package Multithreading;

// Performing Multiple Tasks by Multiple Threads

public class Lecture25 extends Thread {

    @Override
    public void run() {
        System.out.println("Task 1 " + Thread.currentThread().getName());
    }
}

class UV extends Thread {

    @Override
    public void run() {
        System.out.println("Task 2 " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture25 lecture25 = new Lecture25();
        UV uv = new UV();

        lecture25.start();
        uv.start();
    }
}
