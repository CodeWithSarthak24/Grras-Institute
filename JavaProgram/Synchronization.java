package JavaProgram;

public class Synchronization {

    int availableTicket = 100;

    synchronized void bookingTicket(String name, int ticket) {
        if (ticket <= availableTicket) {
            availableTicket -= ticket;
           // System.out.println("Booking ticket is available " + availableTicket);
            System.out.println("Seat booked successfully " + ticket + " : " + name);
        }else {
            System.out.println("Seat Not Available " + availableTicket + " : " + name);
        }
    }

    public static void main(String[] args) {

        Synchronization s1 = new Synchronization();

        Thread t1 = new Thread(() -> {
            s1.bookingTicket("Jin Ping", 34);
        });

        Thread t2 = new Thread(() -> {
            s1.bookingTicket("Tim cook", 59);
        });

        Thread t3 = new Thread(() -> {
            s1.bookingTicket("Jones", 15);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
