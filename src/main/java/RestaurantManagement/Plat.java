package RestaurantManagement;

public class Plat {
    private final int id;
    private final String nom;

    public Plat(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
