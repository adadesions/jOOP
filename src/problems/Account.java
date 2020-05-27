package problems;

public class Account implements CoreAccount {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance += amount;
        System.out.println("Credit: +" + amount);
    }

    public void debit(double amount) {
        if (this.balance < amount) {
            System.out.println("Debit amount exceeded account balance");
        }
        else {
            this.balance -= amount;
            System.out.println("Debit: -" + amount);
        }
    }

    public void printAccountInfo() {
        System.out.println("=====================");
        System.out.println("Balance: " + this.balance);
        System.out.println("=====================");
    }

    public double getBalance() {
        return balance;
    }
}
