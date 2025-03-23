class WrongAmount extends Exception {
    WrongAmount(String message) {
        super(message);
    }
}


class InsufficientBalance extends Exception {
    InsufficientBalance(String message) {
        super(message);
    }
}

class BankAccountDetails {
    String cus_name;
    int cus_acc;
    double balance;

    public void getData(String cus_name, int cus_acc, double balance) {
        this.cus_name = cus_name;
        this.cus_acc = cus_acc;
        this.balance = balance;
    }

    public void showData() {
        System.out.println("Customer Details: ");
        System.out.println("Name: " + cus_name);
        System.out.println("Account No.: " + cus_acc);
        System.out.println("Account Balance: " + balance);
    }

    public void deposit(double amt) {
        try {
            if (amt <= 0) {
                throw new WrongAmount("Deposit amount cannot be negative or zero!");
            } else {
                balance += amt;
                System.out.println("Amount Deposited Successfully. Updated balance: " + balance);
            }
        } catch (WrongAmount e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdraw(double amt) {
        try {
            if (amt > balance) {
                throw new InsufficientBalance("Insufficient Account Balance!");
            } else {
                balance -= amt;
                System.out.println("Amount Withdrawn Successfully. Updated balance: " + balance);
            }
        } catch (InsufficientBalance e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

  class Main5 {
    public static void main(String[] args) {
        BankAccountDetails ob = new BankAccountDetails();

        ob.getData("Suvankar", 2594, 20000.00);

        ob.showData();
        System.out.println("------------------------------------------------");
        ob.deposit(-100000);
        System.out.println("------------------------------------------------");
        ob.deposit(10000.00);
        System.out.println("------------------------------------------------");
        ob.showData();
        System.out.println("------------------------------------------------");
        ob.withdraw(1000000);
        System.out.println("------------------------------------------------");
        ob.withdraw(1000);
        ob.showData();
    }
}
