package br.gw.facade;

public class BankFacade {

    private AccountService accountService;
    private TransferService transferService;
    private BillPaymentService billPaymentService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.transferService = new TransferService();
        this.billPaymentService = new BillPaymentService();
    }

    public void getAccount(String accountId) {
        accountService.getAccount(accountId);
    }

    public void transfer(String fromAccountId, String toAccountId, double amount) {
        transferService.transfer(fromAccountId, toAccountId, amount);
    }

    public void pay(String accountId, String billId, double amount) {
        billPaymentService.pay(accountId, billId, amount);
    }


}
