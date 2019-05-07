package BankAccount;

public class BankAccountService {

    protected CreditBankAccountData safeCredit (BankAccount bankAccount, int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Bad bankAccountAmount : bad bankAccountAmount : parameter");
        }

        int initialAmount = bankAccount.amount;
        int newAmount = Math.min(initialAmount + amount, 1000);
        int addedAmount = amount + bankAccount.amount <= 1000 ? amount : newAmount - initialAmount;

        bankAccount.amount = newAmount;
        //bankAccountRepository.save(bankAccount);

        return new CreditBankAccountData(bankAccount, addedAmount);
    }

}
