import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;


    // Constructor to initialize account holder and initial balance
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created for " + accountHolder + " with initial balance: " + initialBalance);
        System.out.println("Account successfully created for " + accountHolder+" with balance: " + initialBalance);
    }

    // Method to deposit money into the account
    public void deposite(double amount){
        if(amount>0){
            balance=balance + amount;
            transactionHistory.add("Deposited : "+amount);
            System.out.println("Deposit successful. New balance: " + getBalance());
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            transactionHistory.add("Withdraw : "+amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        }
    }
    // Method to display transaction history
    public void  transactions(){
        System.out.println();
        System.out.println("========== Transaction History for " + accountHolder + ":");
        System.out.println();
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
        System.out.println("Current Balance: " + getBalance());
    }
}