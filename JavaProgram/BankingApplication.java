package JavaProgram;

import java.util.Scanner;

public class BankingApplication {

    // Fields

    String accountHolder, phoneNumber, dob, accountType, emailAddress;
    double balance;

    // Create an account

    public String createAccount(String accountHolder, String phoneNumber, String dob, String accountType, String emailAddress, double balance) {

        this.accountHolder = accountHolder; // right : local
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.accountType = accountType;
        this.accountType = accountType;
        this.emailAddress = emailAddress;
        this.balance = balance;

        return "Account created successfully!" + " account name : " + this.accountHolder;
    }

    // Deposit money

    public String deposit(double amount) {

        balance += amount;

        return "Deposit successfully!" + " with amount : " + amount;
    }

    // Withdrow money

    public String withdraw(double amount) {

        if (amount <= balance){
            balance -= amount;
        }else {
            return "Insufficient funds!";
        }

        return "Withdraw successfully!" + " with amount : " + amount;
    }

    // Check Balance

    public String getBalance() {

        return "Balance : " + balance;
    }

    // Exit

    public void exit(){

        System.out.println("Thank you for using BankingApplication!");
        System.exit(0);
    }

    public static void main(String[] args) {

        BankingApplication app = new BankingApplication();

        // Create an account
/*
       Object s =  app.createAccount("Sarthak","12345","20-01-2004","Saving","abc@gmail.com",2000.00);
        System.out.println(s);
        System.out.println(app.getBalance());
        System.out.println(app.withdraw(500.00));
        System.out.println(app.getBalance());
        System.out.println(app.deposit(1000));
        System.out.println(app.getBalance());

 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the detail for creating account");

        BankingApplication app2 = new BankingApplication();

        System.out.println("Enter the accountHolder name : ");
        app2.accountHolder = sc.nextLine();

        System.out.println("Enter the phone number : ");
        app2.phoneNumber = sc.nextLine();

        System.out.println("Enter the dob : ");
        app2.dob = sc.nextLine();

        System.out.println("Enter the account type : ");
        app2.accountType = sc.nextLine();

        System.out.println("Enter the account email : ");
        app2.emailAddress = sc.nextLine();

        System.out.println("Enter the balance : ");
        app2.balance = sc.nextDouble();


        System.out.println(app2.createAccount(app2.accountHolder, app2.phoneNumber, app2.dob, app2.accountType, app2.emailAddress, app2.balance));


    }
}
