package br.gw.command;

public class BankAccount {

    private int balance;
    private int overdraftLimit = -500;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public boolean deposit(int amount) {
        this.setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + ", balance is now " + getBalance());
        return true;
    }

    public boolean withdraw(int amount) {
        if(validateFunds(amount)) {
            this.setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + ", balance is now " + getBalance());
            return true;
        }
        return false;
    }

    private boolean validateFunds(int amount) {
        return getBalance() - amount >= getOverdraftLimit();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }

}
