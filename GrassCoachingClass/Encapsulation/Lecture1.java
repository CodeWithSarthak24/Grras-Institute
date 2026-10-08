package GrassCoachingClass.Encapsulation;

// Bank Account Example
public class Lecture1 {

    double balance;

    public void deposit(int money){
        if (money > 0){
            balance += money;
        }
    }

    public void withdraw(int money){
        if (money <= balance){
            balance -= money;
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {

        Lecture1 l = new Lecture1();
        l.balance = 400;
        l.deposit(100);
        System.out.println(l.getBalance());
        l.withdraw(400);
        System.out.println(l.getBalance());
    }
}
