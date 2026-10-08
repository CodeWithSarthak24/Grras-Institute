package Synchronization;

public class Lecture17 {
    static Object pen = new Object();
    static Object noteBook = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{

            synchronized (pen){
                System.out.println("Acquire lock on pen");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }

                synchronized (noteBook){
                    System.out.println("Acquire lock on noteBook");
                }
            }
        });

        t1.start();

        Thread t2 = new Thread(() ->{

            synchronized (pen){
                System.out.println("Acquire lock on pen");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }

                synchronized (noteBook){
                    System.out.println("Acquire lock on noteBook");
                }
            }
        });

        t2.start();
    }
}
