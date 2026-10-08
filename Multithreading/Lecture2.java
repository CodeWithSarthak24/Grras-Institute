package Multithreading;

// Method 2 : implementing runnable interface

public class Lecture2 implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while( i < 6){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {

        Lecture2 lecture2 = new Lecture2();
        Thread thread = new Thread(lecture2);
        thread.start();

    }
}
