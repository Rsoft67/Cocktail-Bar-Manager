package com.cytech.collections;

import com.cytech.ingredients.Produits;

import java.util.ArrayList;
import java.util.List;

public class GestionProduits {
    private List<Produits> produitsEnregistres; // Assurez-vous que cette ligne est correcte

    public GestionProduits() {
        this.produitsEnregistres = new ArrayList<>();
    }

    public void ajouterProduit(Produits produit) {
        produitsEnregistres.add(produit);
    }

    public void afficherProduits() {
        System.out.println("Liste des produits enregistrés :");
        for (Produits produit : produitsEnregistres) {
            System.out.println(produit.getNom()); // Supposant que la classe Produits a une méthode getNom() pour récupérer le nom du produit
        }
    }
}
