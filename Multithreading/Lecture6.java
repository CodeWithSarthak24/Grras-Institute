package Multithreading;

// yield() method

public class Lecture6 extends Thread{

    @Override
    public void run(){
        Thread.yield();
        int i = 0;
        while(i < 5){
            System.out.println(Thread.currentThread().getName());
            i++;
        }
    }

    public static void main(String[] args) {

        Lecture6 l = new Lecture6();
        l.start();

        int x = 5;
        while(x < 10){
            System.out.println(Thread.currentThread().getName());
            x++;
        }
    }
}
