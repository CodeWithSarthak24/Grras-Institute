package Multithreading;

// Join method using runnable interface

public class Lecture17 {
    public static void main(String[] args) throws InterruptedException {

        Runnable r = () -> {
            try{
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        t1.join();

        try{
            for (int i = 5; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
