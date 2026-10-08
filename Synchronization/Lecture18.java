package Synchronization;

// RaceCondition problem

public class Lecture18 {

    int counter;
    public static void main(String[] args) {

        Lecture18 l = new Lecture18();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 9500; i++) {
                l.counter++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 9500; i++) {
                l.counter++;
            }
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(l.counter);
    }
}

/*

public class Lecture18 {

    static int counter;
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 9500; i++) {
                counter++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 9500; i++) {
                counter++;
            }
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }
}

 */