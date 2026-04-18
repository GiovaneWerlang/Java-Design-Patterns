package br.gw.facade;

public class BillPaymentService {

    public void pay(String fromAccountId, String billId, double amount) {
        System.out.println("Payment from " + fromAccountId + " to " + billId + " amount: " + amount);
    }

}
