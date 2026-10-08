package Multithreading;

// Daemon thread

public class Lecture11 extends Thread{

    @Override
    public void run(){

        while (true){
            System.out.println("Daemon thread...... performing background support");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        Lecture11 l = new Lecture11();
        l.setDaemon(true);
        l.start();

        for(int i = 1; i < 8; i++){
            System.out.println(i);
        }
    }
}

/*

What happens?

Main Thread
    ↓
t.start()
    ↓
Daemon Thread starts
    ↓
Daemon does background work
    ↓
Main Thread finishes
    ↓
No user threads remain
    ↓
JVM terminates
    ↓
Daemon Thread stops

Even though this:

while (true),
never ends, the JVM can still terminate because t is a daemon thread.

 */