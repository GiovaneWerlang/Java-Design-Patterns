package br.gw.facade;

public class TransferService {

    public void transfer(String fromAccountId, String toAccountId, double amount) {
        System.out.println("Transfer from " + fromAccountId + " to " + toAccountId + " amount: " + amount);
    }

}
