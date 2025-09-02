package RestaurantManagement;

import java.time.Instant;

public class CommandeEnLigne extends Commande {
   private final MoyenDePaiement moyenDePaiement;
    private final String adresseDeLivraison;

    public CommandeEnLigne(int id, Instant dateDeCreation, MoyenDePaiement moyenDePaiement, String adresseDeLivraison) {
        super(id, dateDeCreation);
        this.moyenDePaiement = moyenDePaiement;
        this.adresseDeLivraison = adresseDeLivraison;
    }

    public MoyenDePaiement getMoyenDePaiement() {
        return moyenDePaiement;
    }

    public String getAdresseDeLivraison() {
        return adresseDeLivraison;
    }
}
