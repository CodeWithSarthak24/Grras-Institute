package Multithreading;

// Method 1 : extending thread class

public class Lecture1 extends Thread {

    @Override
    public void run(){
        int i = 1;
        while( i < 6){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {

        Lecture1 l = new  Lecture1();;
        l.start();
    }
}
