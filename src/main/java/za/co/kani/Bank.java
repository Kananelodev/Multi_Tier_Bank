package za.co.kani;

public class Bank {
    private String accountHolder;
    private double balance;

    public Bank(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    } 

    public Bank(String accountHolder, double newBalance) {
        this.accountHolder = accountHolder;

        if (newBalance > 0) {
            this.balance = newBalance;
        } else {
            this.balance = 0;
        }
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    public String getBalance() {
        return "balance: " + balance;
    }
}