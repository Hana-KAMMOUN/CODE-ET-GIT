public class StockManager {

    /**
     * Met à jour le stock d'un produit en fonction de l'opération (ajout ou retrait).
     *
     * @param typeOperation Type de l'opération : "ajout" ou "retrait".
     * @param produit       Nom du produit concerné.
     * @param quantite      Quantité à ajouter ou retirer.
     * @param stock         Stock actuel du produit.
     * @return              Le nouveau stock après l'opération ou -1 en cas d'erreur.
     */
    public int mettreAJourStock(String typeOperation, String produit, int quantite, int stock) {
        if ("ajout".equals(typeOperation)) {
            return ajouterAuStock(produit, quantite, stock);
        } else if ("retrait".equals(typeOperation)) {
            return retirerDuStock(produit, quantite, stock);
        } else {
            System.out.println("Opération inconnue pour le produit : " + produit);
            return -1; // Code d'erreur pour une opération inconnue
        }
    }

    /**
     * Ajoute une quantité au stock.
     *
     * @param produit  Nom du produit.
     * @param quantite Quantité à ajouter.
     * @param stock    Stock actuel du produit.
     * @return         Nouveau stock après ajout.
     */
    private int ajouterAuStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    /**
     * Retire une quantité du stock si le stock est suffisant.
     *
     * @param produit  Nom du produit.
     * @param quantite Quantité à retirer.
     * @param stock    Stock actuel du produit.
     * @return         Nouveau stock après retrait ou stock initial si insuffisant.
     */
    private int retirerDuStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }
}
