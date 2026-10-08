package Multithreading;

// Thread.sleep() : Sleep with Negative Time

public class Lecture5{
    public static void main(String[] args) {

       Runnable r = () -> {

           System.out.println("Start");

          try{
              // Thread.sleep(1000, -1);
               // Thread.sleep(-1);
              Thread.sleep(1000, 100);
          }
          catch(InterruptedException e){
              System.out.println(e.getMessage());
          }
          System.out.println("End");
       };

       Thread t1 = new Thread(r);
       t1.start();
    }
}
