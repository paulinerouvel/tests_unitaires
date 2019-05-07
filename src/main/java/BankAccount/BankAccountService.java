package BankAccount;




public class BankAccountService {


    private BankAccountRepository repo;

    public BankAccountCredit credit(BankAccount bankAccount, double amount) {



        if(bankAccount.getAmount() + amount < 0) {
            return new BankAccountCredit(bankAccount, 0);
        } else {
            double newAmount = Math.min(bankAccount.getAmount() + amount, 1000);
            double addedAmount = amount + bankAccount.getAmount() <= 1000 ? amount : newAmount - bankAccount.getAmount();
            bankAccount.setAmount(newAmount);

            boolean res = repo.saveCredit(new BankAccountCredit(bankAccount, addedAmount));

            if(res){
                return new BankAccountCredit(bankAccount, addedAmount);
            }
            else{
                return new BankAccountCredit(bankAccount, 0);
            }


        }
    }
}
