package Users;

public class BankAccount {
    public int id;
    public Users owner;
    public int amount;

    BankAccount(int id, Users owner, int amount){
        this.id = id;
        this.owner = owner;
        this.amount = amount;

    }
    public void changeOwner(Users owner){
        this.owner = owner;
    }
}


// Je ne veux pas que ma méthode Save soit innnnutilisable à cause de ma méthode User
