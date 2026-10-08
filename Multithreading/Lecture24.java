package Multithreading;

// Example: Single Task Using Multiple Threads (Implementing Runnable)


public class Lecture24{

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        Runnable r = () -> {

            // System.out.println(76 + " " + Thread.currentThread().getName());

            //  String s = "Sarthak";
            // System.out.println(s);

            // print("Hello World");

            String x = "UV";
            print(x);
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}









/*

Approach 1 : Basic

public class Lecture24 implements Runnable{

    @Override
    public void run() {
        System.out.println("Lecture24 start " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Lecture24 l1 = new Lecture24();

        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l1);

        t1.start();
        t2.start();
    }
}
-------------------------------
Approach 2 : Lambda

public class Lecture24{

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        Runnable r = () -> {

           // System.out.println(76 + " " + Thread.currentThread().getName());

           //  String s = "Sarthak";
            // System.out.println(s);

            // print("Hello World");

            String x = "UV";
            print(x);
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
-------------------------
Approach 3 : Anonymous Object

public class Lecture24 implements Runnable{

    @Override
    public void run() {
        System.out.println("Lecture 24 " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {

    Thread t1 = new Thread(new Lecture24());
    t1.start();

        Thread t2 = new Thread(new Lecture24());
        t2.start();

    }
}
--------------------------
Approach 4 : Anonymous Class : Using Anonymous Class Extending Thread

public class Lecture24 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
    Thread t1 = new Thread(){

        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }

       };

      t1.start();
    }
}
--------------------------
Approach 5 : Anonymous Class : Using Anonymous Class Implementing Runnable

public class Lecture24 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {

                Thread.currentThread().setName("Ux1");

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }

            }

        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}

*/
















