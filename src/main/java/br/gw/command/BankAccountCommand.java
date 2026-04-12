package br.gw.command;

public class BankAccountCommand implements Command {

    private BankAccount bankAccount;
    private Action action;
    private int amount;
    private boolean suceeded;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isSuceeded() {
        return suceeded;
    }

    public void setSuceeded(boolean suceeded) {
        this.suceeded = suceeded;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                setSuceeded(getBankAccount().deposit(amount));
                break;
            case WITHDRAW:
                setSuceeded(getBankAccount().withdraw(amount));
                break;
        }
    }

    @Override
    public void undo() {
        if(!isSuceeded()) {
            return;
        }
        switch (action) {
            case DEPOSIT:
                getBankAccount().withdraw(amount);
                break;
            case WITHDRAW:
                getBankAccount().deposit(amount);
                break;
        }
    }
}
