package Synchronization;

// volatile keyword

public class Lecture15 {
    volatile boolean flag = true;

    public void working(){
        while (flag){
            System.out.println("Server is working...........");
        }
    }

    public void stop(){
        flag = false;
    }

    public static void main(String[] args) {

        Lecture15 l = new Lecture15();

        Thread th1 = new Thread( ()->{
            l.working();
        });
        th1.start();

        Thread th2 = new Thread( ()->{
            l.stop();
        });
        th2.start();

    }
}
