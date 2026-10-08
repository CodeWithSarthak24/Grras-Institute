package JavaProgram;
// for each object the instance value is 100
public class Synchro {
     int availableTicket = 100;

    synchronized  void bookingTicket(String name, int ticket) {
        if (ticket <= availableTicket) {
            availableTicket -= ticket;
            // System.out.println("Booking ticket is available " + availableTicket);
            System.out.println("Seat booked successfully " + ticket + " By " + name);
        }else {
            System.out.println("Seat Not Available " + availableTicket + " for " + name);
        }
    }

    public static void main(String[] args) {

        Synchro s1 = new Synchro();
        Synchro s2 = new Synchro();

        Thread t1 = new Thread(() -> {
           s1. bookingTicket("Alex", 40);
        });

        Thread t2 = new Thread(() -> {
            s1.bookingTicket("James", 150);
        });

        t1.start();
        t2.start();

        Thread t4 = new Thread(() -> {
            s2.bookingTicket("Peter", 10);
        });

        Thread t5 = new Thread(() -> {
            s2.bookingTicket("Mary", 90);
        });

        t4.start();
        t5.start();

    }
}
