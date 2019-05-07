package BankAccount;

public class CreditBankAccountData {

    public BankAccount newBankAccount;
    public Integer amountAdded;

    public CreditBankAccountData(BankAccount bankAccount, Integer amountAdded) {
        this.newBankAccount = bankAccount;
        this.amountAdded = amountAdded;
    }
}
