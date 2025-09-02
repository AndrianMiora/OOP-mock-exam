package RestaurantManagement;

import java.util.List;

public class Plat {
    private final int id;
    private final String nom;
    private final List<Float> historiquePrix;

    public Plat(int id, String nom, List<Float> historiquePrix) {
        this.id = id;
        this.nom = nom;
        this.historiquePrix = historiquePrix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Float> getHistoriquePrix() {
        return historiquePrix;
    }
}
