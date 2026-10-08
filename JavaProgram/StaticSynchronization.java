package JavaProgram;
// through any object ref any static value change it will reflect for other obj
public class StaticSynchronization {
   static int availableTicket = 100;

    synchronized static void bookingTicket(String name, int ticket) {
        if (ticket <= availableTicket) {
            availableTicket -= ticket;
            // System.out.println("Booking ticket is available " + availableTicket);
            System.out.println("Seat booked successfully " + ticket + " By " + name);
        }else {
            System.out.println("Seat Not Available " + availableTicket + " for " + name);
        }
    }

    public static void main(String[] args) {

        StaticSynchronization s1 = new StaticSynchronization();
        StaticSynchronization s2 = new StaticSynchronization();

        Thread t1 = new Thread(() -> {
            s1.bookingTicket("Alex", 40);
        });

        Thread t2 = new Thread(() -> {
            s1.bookingTicket("James", 110);
        });

        t1.start();
        t2.start();


        Thread t4 = new Thread(() -> {
            s2.bookingTicket("Peter", 30);
        });

        Thread t5 = new Thread(() -> {
           s2. bookingTicket("Mary", 60);
        });

        t4.start();
        t5.start();
    }
}
