package BankAccount;

import Users.User;

public class BankAccount {

    public Integer id;
    public User user;
    public Integer amount;

    void BankAccount(Integer id, User user, Integer amount) {

            this.id = id;
            this.user = user;
            this.amount = amount;

    }

}
