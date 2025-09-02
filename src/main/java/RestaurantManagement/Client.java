package RestaurantManagement;

public class Client {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String telephone;
    private final String email;

    public Client(int id, String nom, String prenom, String telephone, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
}
