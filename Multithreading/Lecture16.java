package Multithreading;

// Join method

public class Lecture16 extends Thread{

    @Override
    public void run() {
        System.out.println("Project start");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Project end");
    }

    public static void main(String[] args) throws InterruptedException {

        Lecture16 lecture = new Lecture16();
        lecture.start();
        lecture.join();

            try{
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

