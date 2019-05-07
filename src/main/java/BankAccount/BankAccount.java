package BankAccount;

import Users.User;

public class BankAccount {

    private Integer id;
    private User user;
    private double amount;

    public BankAccount(Integer id, User user, double amount) {
        this.id = id;
        this.user = user;
        this.amount = amount;
    }


    public Integer getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }

    public double getAmount(){
        return this.amount;
    }


    public void setId(Integer newId){
        this.id = newId;
    }

    public void setUser(User newUser){
        this.user = newUser;
    }

    public void setAmount(double newAmount){
        this.amount = newAmount;
    }


}
