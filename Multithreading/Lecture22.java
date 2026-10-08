package Multithreading;

// isInterrupted method

public class Lecture22 extends Thread {

    @Override
    public void run() {
         System.out.println(Thread.currentThread().isInterrupted());
         System.out.println(Thread.currentThread().isInterrupted());
        try {
            for(int i=1;i<5;i++){
                System.out.println(i);
                Thread.sleep(2000); // it checks the interrupted status it is false it will continue
                // it checks the interrupted status it is true it will stop and throw exception
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Lecture22 l =new Lecture22();
        l.start();
        l.interrupt();
    }
}
