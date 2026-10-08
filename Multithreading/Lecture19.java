package Multithreading;

// Another example

public class Lecture19 extends Thread{

    @Override
    public void run(){

        try {
            System.out.println("Enter into room");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exit from room");
    }
}

class Car extends Thread{

    @Override
    public void run(){

        try {
            System.out.println("Enter into car");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exit from car");
    }
}
class Exam extends Thread{

    @Override
    public void run(){

        try {
            System.out.println("Exam start");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exam end");
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {

     /*   Lecture19 l = new Lecture19();
        l.start();
        l.join(); // Waits for Lecture19 to finish

        Car c = new Car();
        c.start();
        c.join(); // Waits for Car to finish

        Exam exam = new Exam();
        exam.start();
        exam.join(); // Waits for Exam to finish
*/
        Thread[] threads = { new Lecture19(), new Car(), new Exam() };
        // 1. Start ALL threads immediately (they run at the same time)
        for (Thread t : threads) {
            t.start();
        }

        // 2. Wait for ALL threads to finish before moving to the main loop
        for (Thread t : threads) {
            t.join();
        }

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}