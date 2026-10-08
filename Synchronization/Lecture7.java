package Synchronization;

// static method has synchronization block

public class Lecture7 {

    public static void print(){
        synchronized (Lecture8.class) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }

            for (int i = 6; i <= 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Lecture7 l  = new Lecture7();

        Thread t1 = new Thread(Lecture7::print);
        t1.start();

        Thread t2 = new Thread(Lecture7::print);
        t2.start();

        //  Runnable r1 = Lecture8::print; // because we are calling from static method
        // Thread t1 = new Thread(r1);
        // t1.start();

        //  Runnable r2 = Lecture8::print; // because we are calling from static method
        // Thread t2 = new Thread(r2);
        // t2.start();

    }
}
