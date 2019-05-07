package BankAccount;

public class BankAccountCredit {

    private BankAccount BankAccount;
    private double amount;

    public BankAccountCredit(BankAccount BA, double amount){
        this.amount = amount;
        this.BankAccount = BA;
    }

    public double getAmount(){
        return this.amount;
    }

    public BankAccount getBankAccount(){
        return this.BankAccount;
    }

    public void setAmount(double newAmount){
        this.amount = newAmount;
    }

    public void setBankAccount(BankAccount newBankAccount){
        this.BankAccount = newBankAccount;
    }
}
