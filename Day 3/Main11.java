
/*
Write a program to define a class `Customer` with `name` and `customerID`.  
Initialize the variables using a constructor.  

Define a class `SavingsAccount` with a member variable `accountNumber`.  
Initialize the variable using a constructor. This class is a child of `Customer`.  

Define another child class of `Customer` called `CurrentAccount`,  
with a member variable `accountNumber` and initialize it using a constructor.  

Create a child class of `SavingsAccount` named `FixedDeposit`,  
with a member variable `amount interest time in days`.  
Initialize the variable using a constructor and define a method  
to display the records of the customer's fixed deposit.  

Define a child class of `CurrentAccount` named `LoanAccount`,  
with a member variable `amount Interest`.  
Define a method to display the records of the loan account.  
*/


class Customer {
    String name;
    String customerID;

    Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
    }
}

class SavingsAccount extends Customer {
    String accountNumber;

    SavingsAccount(String name, String customerID, String accountNumber) {
        super(name, customerID);
        this.accountNumber = accountNumber;
    }
}

class CurrentAccount extends Customer {
    String accountNumber;

    CurrentAccount(String name, String customerID, String accountNumber) {
        super(name, customerID);
        this.accountNumber = accountNumber;
    }
}

class FixedDeposit extends SavingsAccount {
    double amount;
    double interest;
    int timeInDays;

    FixedDeposit(String name, String customerID, String accountNumber, double amount, double interest, int timeInDays) {
        super(name, customerID, accountNumber);
        this.amount = amount;
        this.interest = interest;
        this.timeInDays = timeInDays;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
        System.out.println("Time in days: " + timeInDays);
    }
}

class LoanAccount extends CurrentAccount {
    double ammount;
    double interest;
    LoanAccount(String name, String customerID, String accountNumber, double ammount, double interest) {
        super(name, customerID, accountNumber);
        this.ammount=ammount;
        this.interest=interest;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("CustomerID: "+customerID);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Amount: "+ammount);
        System.out.println("Interest: "+interest);

    }
}

public class Main11 {
    public static void main(String[] args) {
        FixedDeposit ob1 = new FixedDeposit("Suvankar", "A123", "2594", 10000, 5, 200);
        LoanAccount ob2 = new LoanAccount("Soham", "X123", "2021", 20000, 5);
        ob1.display();
        ob2.display();
    }
}