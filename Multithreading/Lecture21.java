package Multithreading;

// Interrupted method

public class Lecture21 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.interrupted()); // first it print true and then it changes the interrupted status to true to false
        System.out.println(Thread.interrupted()); // false to true
        try {
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(2000); // it checks the interrupted status it is false it will continue
                // it checks the interrupted status it is true it will stop and throw exception
                System.out.println(Thread.interrupted());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Lecture21 lecture21=new Lecture21();
        lecture21.start();
        lecture21.interrupt();

    }
}
