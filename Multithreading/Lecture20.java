package Multithreading;

// Interrupt method

public class Lecture20 extends Thread {

    @Override
    public void run() {
        try {
           for(int i=0;i<5;i++){
               System.out.println(i);
               Thread.sleep(2000);
           }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Lecture20 lecture20 = new Lecture20();
        lecture20.start();
        lecture20.interrupt();
    }
}
