package Synchronization;

// Without using volatile keyword

public class Lecture14 {
    boolean flag = true;

    public void working(){
        while (flag){
            System.out.println("Server is working...........");
        }
    }

    public void stop(){
        flag = false;
    }

    public static void main(String[] args) {

        Lecture14 l = new Lecture14();

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

// The important point is:
// Because without volatile, Java gives you no guarantee that Thread 1 will see the update correctly.
// With volatile, the update is guaranteed to be visible to the other thread.