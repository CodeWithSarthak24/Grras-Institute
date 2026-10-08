package Synchronization;

// data is static  : There is one studentMark shared by all objects.
public class Lecture12 {

    static int studentMark;

    public static void calculatingMark() {

        synchronized (Lecture10.class) {

            studentMark = 90 + 85 + 73 + 71;

            Lecture10.class.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Lecture11 l = new Lecture11();

        Thread t = new Thread(() -> {
            calculatingMark();
        });

        t.start();

        synchronized (Lecture10.class) {
            Lecture10.class.wait();

            System.out.println(studentMark);
        }
    }
}
