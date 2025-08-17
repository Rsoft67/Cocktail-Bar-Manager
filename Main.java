package com.cytech;

import com.cytech.collections.GestionProduits;
import com.cytech.ingredients.Boisson;

public class Main {
    public static void main(String[] args) {
        // Créer une instance de GestionProduits
        GestionProduits gestionProduits = new GestionProduits();

        // Créer une boisson (exemple : Coca-Cola)
        Boisson cocaCola = new Boisson("Coca-Cola");

        // Ajouter la boisson à la liste de produits
        gestionProduits.ajouterProduit(cocaCola);

        // Vous pouvez ajouter d'autres produits ici si nécessaire

        // Exemple de méthode d'affichage des produits (à implémenter dans GestionProduits)
        gestionProduits.afficherProduits();
    }
}
