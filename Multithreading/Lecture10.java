package Multithreading;

// Naming Method : Example of naming a thread : Without Using setName() Method

public class Lecture10 extends Thread{

    Lecture10(String name){
        // call parent class i.e., Thread
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture10 l = new Lecture10("Memories");
        l.start();
    }
}
