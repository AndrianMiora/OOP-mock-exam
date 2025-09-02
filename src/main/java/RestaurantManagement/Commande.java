package RestaurantManagement;

import java.time.Instant;

public class Commande {
    private final int id;
    private final Instant dateDeCreation;

    public Commande(int id, Instant dateDeCreation) {
        this.id = id;
        this.dateDeCreation = dateDeCreation;
    }

    public int getId() {
        return id;
    }

    public Instant getDateDeCreation() {
        return dateDeCreation;
    }
}
