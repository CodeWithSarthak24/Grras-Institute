package Synchronization;

// using : wait(), notify()

public class Lecture10 {
    int studentMark;

    public synchronized void calculatingMark() {
        int a = 90, b = 85, c = 73, d = 71;
        studentMark = a + b + c + d;
        notify(); //  Notifies the thread waiting on "this" object lock
    }

    public static void main(String[] args) throws InterruptedException {

        Lecture10 l = new Lecture10();

        Runnable r = l::calculatingMark;

        Thread t = new Thread(r);
        t.start();
        synchronized (l){
            l.wait(); // It pauses the thread that executed the line of code.
        }
        System.out.println(l.studentMark);
    }
}
