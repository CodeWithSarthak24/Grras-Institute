package Synchronization;

public class Lecture19 {

    static int counter;

    public synchronized static void increment(){
       for(int i = 1; i <= 9000; i++){
           counter++;
       }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
           increment();
        });

        Thread t2 = new Thread(() -> {
            increment();
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }
}
