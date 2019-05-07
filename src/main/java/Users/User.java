package Users;


import java.time.LocalDate;


public class User {

    private String nom;
    private String prenom;
    private Integer id;
    private LocalDate dateNaissance;


   public User(String nom, String prenom, Integer id, LocalDate date) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.dateNaissance = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}