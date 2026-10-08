package Multithreading;

// Another Daemon thread example

public class Lecture12 extends Thread{

    Lecture12(String name){
        super(name);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Providing background support");
        }
    }
}

class UserThread{
    public static void main(String[] args) {

        Runnable r = ()-> {

            for(int i = 0; i < 6; i++){
                System.out.println(i);
            }
        };

        // User thread
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        // Daemon thread
        Lecture12 l1 = new Lecture12("Daemon : 1");
        Lecture12 l2 = new Lecture12("Daemon : 2");

        l1.setDaemon(true);
        l2.setDaemon(true);

        l1.start();
        l2.start();

        t1.start();
        t2.start();
    }
}
