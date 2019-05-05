package Users;
import java.time.LocalDate;

public class Users {
    public String nom;
    public String prenom;
    public int id;
    public LocalDate dateNaissance;

    public Users(String nom, String prenom, int id, LocalDate dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public boolean isValid(){
        return isNotBlank(this.nom)
            && isNotBlank(this.prenom)
            && isAdult();
    }
    protected boolean isAdult(){
        return this.dateNaissance != null
                && birthdate.plusYears(18).isBefore(now);
    }
}

// import lombok.*;
// @Collumn(name = "birthdate")
// @Setter
// @Getter
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Entity

