package br.gw.memento;

public class BankAccount {

    private int balance;

    public BankAccount() {
    }

    public Memento setBalance(int balance) {
        this.balance = balance;
        return new Memento(this.balance);
    }

    public int getBalance() {
        return balance;
    }

    public Memento deposit(int amount) {
        this.balance += amount;
        return new Memento(this.balance);
    }

    public void restore(Memento memento) {
        this.setBalance(memento.getBalance());
    }

}
