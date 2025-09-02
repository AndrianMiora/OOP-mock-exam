package RestaurantManagement;

import java.time.Instant;

public class CommandeEnLigne {
    private final int id;
    private final Instant dateDeCreation;
    private final MoyenDePaiement moyenDePaiement;
    private final String adresseDeLivraison;

    public CommandeEnLigne(int id, Instant dateDeCreation, MoyenDePaiement moyenDePaiement, String adresseDeLivraison) {
        this.id = id;
        this.dateDeCreation = dateDeCreation;
        this.moyenDePaiement = moyenDePaiement;
        this.adresseDeLivraison = adresseDeLivraison;
    }

    public int getId() {
        return id;
    }

    public Instant getDateDeCreation() {
        return dateDeCreation;
    }

    public MoyenDePaiement getMoyenDePaiement() {
        return moyenDePaiement;
    }

    public String getAdresseDeLivraison() {
        return adresseDeLivraison;
    }
}
