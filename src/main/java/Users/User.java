package Users;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.Date;

public class User {

    public String nom;
    public String prenom;
    public Integer id;
    public LocalDate dateNaissance;


   public User(String nom, String prenom, Integer id, LocalDate date) {

        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.dateNaissance = date;

    }
    public boolean isValid() {
        if(!nom.isBlank() || !prenom.isBlank() || LocalDate.now().getYear() - dateNaissance.getYear() <= 18){
            return false;
        }
        else {
            return true;
        }
    }
}