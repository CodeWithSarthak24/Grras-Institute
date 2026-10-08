package Multithreading;

// isAlive()

public class Lecture8 extends Thread{

    @Override
    public void run(){
        System.out.println("Task started...");
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args){

        Lecture8 l = new Lecture8();
        l.start();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(l.isAlive());
    }
}

/*
public static void main(String[] args) {

    Lecture8 l = new Lecture8();
    l.start();
    System.out.println(l.isAlive());
    }
}

You may get: true

because the main thread checks isAlive() while l is still executing.
But because the task is very short, the result can depend on timing.

-> "If the main thread checks isAlive() while the other thread is still running,
it returns true. If the main thread waits long enough for the other thread to finish and then checks isAlive(), it returns false."
 */