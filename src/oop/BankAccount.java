package oop;

public class BankAccount {
    private final static String DEPOSIT_AMOUNT_ERROR="deposit amount has to be positive.";
    private final static String WITHDRAW_AMOUNT_ERROR="withdraw amount is not valid";

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        if (accountNumber !=null && !accountNumber.isBlank() ){
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = "0000000";
        }

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

//    public void deposit(double amount) {
//        if (amount < 0) {
//            throw new IllegalArgumentException(DEPOSIT_AMOUNT_ERROR);
//        }
//        balance = balance + amount;
//    }
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        balance = balance + amount;
        return true;
    }

//    public void withdraw(double amount) {
//        if (amount< 0 || amount > balance) {
//            throw new IllegalArgumentException(WITHDRAW_AMOUNT_ERROR);
//        }
//
//        balance = balance - amount;
//    }
    public boolean withdraw(double amount) {
        if (amount< 0 || amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
    public void withdraw(double amount, double fee) {
        double total = amount+fee;
        if (amount < 0 || fee<=0 || total>balance) {
            throw new IllegalArgumentException(WITHDRAW_AMOUNT_ERROR);
        }
        balance -= total;
    }

}
