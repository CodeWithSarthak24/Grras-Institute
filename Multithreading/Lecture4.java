package Multithreading;

// Thread.sleep()

public class Lecture4 {
    public static void main(String[] args) {

        Runnable r = () -> {

            for(int i = 1; i < 11; i++){
                System.out.println(i * 5);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
