package com.cytech.GestionFichiers;
import java.util.Scanner;

public class Client {

        private String nom;
        private String prenom;
        private String adresseMail;
        private String adresse;
        private String dateNaissance;
        private String phraseSecrete;

        public Client(String nom, String prenom, String adresseMail, String dateNaissance, String phraseSecrete) {
            this.nom = nom;
            this.prenom = prenom;
            this.adresseMail = adresseMail;
            this.dateNaissance = dateNaissance;
            this.phraseSecrete = phraseSecrete;
        }

        public String getNom()
        {
            return nom;
        }
        public String getPrenom()
        {
            return prenom;
        }
        public String getAdresseMail()
        {
            return adresseMail;
        }
        public String getAdresse()
        {
            return adresse;
        }
        public String getDateNaissance()
        {
            return dateNaissance;
        }
        public String getPhraseSecrete()
        {
            return phraseSecrete;
        }

        public void setNom( String nom)
        {
            this.nom=nom;
        }
        public void setPrenom( String prenom)
        {
            this.prenom=prenom;
        }
        public void setAdresseMail( String adresseMail)
        {
            this.adresseMail=adresseMail;
        }
        public void setAdresse( String adresse)
        {
            this.adresse=adresse;
        }
        public void setDateNaissance( String dateNaissance)
        {
            this.dateNaissance=dateNaissance;
        }
        public void setPhraseSecrete( String phraseSecrete)
        {
            this.phraseSecrete=phraseSecrete;
        }
    public void commandeIngredients(Barman barman) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien d'ingrédients voulez-vous commander ?");
        int nombreIngredients = scanner.nextInt();
        String[] ingredients = new String[nombreIngredients];// cette ligne et celle dans dessous permettent de déclarer direcetment dans la méthode les tableau de chaine de caractére et d'entiers pour demandé directement au clients ce qu'il veut afin de pas surcharger le main 
        int[] quantites = new int[nombreIngredients];

        for (int i = 0; i < nombreIngredients; i++) {
            System.out.println("Entrez le nom de l'ingrédient " + (i+1) + " :");
            ingredients[i] = scanner.next();
            System.out.println("Entrez la quantité de " + ingredients[i] + " :");
            quantites[i] = scanner.nextInt();
        }

        for (int i = 0; i < ingredients.length; i++) {
            barman.consumeIngredient(ingredients[i], quantites[i]);
        }
    }
    public void commandeCocktail(Barman barman) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Combien de cocktails souhaitez-vous commander ?");
            int count = scanner.nextInt();

            scanner.nextLine(); // Nettoyer le buffer

            String[] cocktails = new String[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Entrez le nom du cocktail " + (i + 1) + " :");
                cocktails[i] = scanner.nextLine();
            }


            for (String cocktailName : cocktails) {
                barman.consumeCocktail(cocktailName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
