package Synchronization;

// problem without : wait(), notify()

// When one thread is performing a time-consuming task, such as calculating marks,
// the main thread may continue executing without waiting for the calculation to finish.
// If the main thread tries to read and print the result before the worker thread has completed the calculation,\
// it may get an incorrect or incomplete result.

public class Lecture9 {
    int studentMark;

    public void calculatingMark() {
        int a = 90, b = 85, c = 73, d = 71;
        studentMark = a + b + c + d;
    }

    public static void main(String[] args){

        Lecture9 l = new Lecture9();

        Runnable r = ()->{
            l.calculatingMark();
        };

        Thread t = new Thread(r);
        t.start();

        System.out.println(l.studentMark);
    }
}
