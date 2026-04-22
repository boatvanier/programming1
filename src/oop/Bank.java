package oop;

public class Bank {
    private BankAccount[] accounts;

    public Bank(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public double getTotalBalance() {
        double total = 0;
        for(BankAccount acc: accounts) {
            total += acc.getBalance();
        }

        return total;
    }
    //ACID
    public boolean transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            if (to.deposit(amount)) {
                return true;
            }else {
                from.deposit(amount);
                return false;
            }
        }else {
            return false;
        }
    }
}
