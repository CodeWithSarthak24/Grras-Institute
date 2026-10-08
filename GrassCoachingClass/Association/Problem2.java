package GrassCoachingClass.Association;

// Example 1: Customer Uses Bank
class Bank {

    String bankName;
    String address;

    Bank(String bankName, String address){
        this.bankName = bankName;
        this.address = address;
    }
}

class Customer {

    String name;
    long phoneNumber;

    Customer(String name, long phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void access(Bank bank){
        System.out.println(bank.bankName + " " + bank.address);
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Bank bank = new Bank("SBI", "Shimla");
        Customer customer = new Customer("Priyal", 75687987);
        customer.access(bank);
    }
}

/*

Why Association?

-> Customer uses Bank service.
-> Customer does not store Bank.
-> Customer does not own Bank.

 */

/*

How to Identify Association?

Ask yourself:

Question 1 :
Does one object only use another object's service?

If YES → Association.

Question 2 :
Am I storing the object as a field?

If NO → Association.

Example:

void drive(Car car)

Parameter only.

Association.

Question 3
Can both objects exist independently?

If YES → Association.

Easy Comparison :

A) Association :

void learn(Teacher teacher)  -> Use Teacher, Don't store Teacher.

B) Aggregation :

Teacher teach;  -> Store Teacher reference

 */