package Multithreading;

// Naming Method : Example of naming a thread : Using setName() Method

public class Lecture9 extends Thread{

    @Override
    public void run(){
        Thread.currentThread().setName("Memories");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture9 l = new Lecture9();
        l.start();

        Lecture9 l2 = new Lecture9();
        l2.start();

    }
}
