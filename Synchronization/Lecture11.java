package Synchronization;

// notifyll()

public class Lecture11 {
    int studentMark;

    public void calculatingMark() {

        synchronized (this) {

            studentMark = 90 + 85 + 73 + 71;

            System.out.println("Thread-0 calculated marks");

            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Lecture11 l = new Lecture11();

        // Thread-1
        Thread t1 = new Thread(() -> {

            synchronized (l) {
                try {
                    System.out.println("Thread-1 waiting...");
                    l.wait();

                    System.out.println("Thread-1 got marks: " + l.studentMark);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        // Thread-0
        Thread t0 = new Thread(() -> {
            l.calculatingMark();
        });

        t0.start();

        // Main
        synchronized (l) {

            System.out.println("Main waiting...");

            l.wait();

            System.out.println("Main got marks: " + l.studentMark);
        }
    }
}


/*

Class-level vs Object-level
	   		                Object-level		Class-level
Lock	   		            l	   		        Lecture10.class
Data normally		        int studentMark		static int studentMark
Wait			            l.wait()		    Lecture10.class.wait()
Notify			            l.notifyAll()		Lecture10.class.notifyAll()

 */