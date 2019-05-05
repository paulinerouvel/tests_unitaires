package Users;

public class BankAccountService {
    protected CeditBankAccountData safeCredit(BankAccount bankAccount, int amount) throws Exception {
        notNull(bankAccount, "Bank account must not be null");

        if (amount < 0){
            throw new Exception("Bad bankAccountAmount: bad bankAccountAmount parameter");
        }

        int initialAmount = bankAccount.getAmount();
        int newAmount = Math.min(initialAmount + amount, 1000);
        int addedAmount = amount + bankAccount.getAmount() <= 1000 ? amount : newAmount - initialAmount;
    }
}
