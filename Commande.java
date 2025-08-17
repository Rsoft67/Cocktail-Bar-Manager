import package.Cocktail

//Iliane a toi de faire le constructeur, les getteurs, setteurs et les méthodes de commandes/ Je t'ai juste mis la fonction 
//tu dois creer un tableau de commande. comme ca on parcourt les commandes et on accede a si 
	//c'est un boisson, un cocktail etc. SI client veut un coktails mais il contient une boisson
	//qui na plus de stock afficher que c'est impossible.

public class Commande {
 	 Cocktail instance= new Cocktail();


	
public class CocktailMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

        // Déclaration d'un tableau pour stocker les boissons du cocktail
        String[] cocktail = new String[10]; // Supposons que le cocktail contient au maximum 10 boissons

        // Variable pour suivre l'index actuel dans le tableau de cocktail
        int index = 0;

        // Boucle pour demander les boissons au client
	    public static void main(String[] args) {
      		  while (true) {
            		System.out.print("Quelle boisson voulez-vous ajouter à votre cocktail ? (ou 'stop' pour terminer) : ");
            		String boisson = scanner.nextLine();

            	// Vérification si le client veut terminer la saisie
           	 if (boisson.equalsIgnoreCase("stop")) {
               	 	break; // Sortir de la boucle
           	 }

            	// Ajout de la boisson au cocktail
           	 cocktail[index] = boisson;

            	// Incrémenter l'index pour la prochaine boisson
            	index++;

            System.out.println("Boisson ajoutée au cocktail !");
        }

        	// Affichage du cocktail
        	System.out.println("Votre cocktail contient :");
        	for (int i = 0; i < index; i++) {
            		System.out.println("- " + cocktail[i]);
        	}

        	// Fermeture du scanner
        	scanner.close();
    		}
}
		
		

	public float calculerPrixCocktail(cocktail tab) {
			float somme=0;
			for(int i=0; i<tab.length: i++) {
				somme=somme+tab[i].getPrix();
			}
	return somme:
}

	public void sauvegarderCommandes()  
	
	public double calculerChiffreAffaires(Commande tableau) {
		double ca=0;
		for (i=0; i<tableau.length; i++ ) {
			if (tableau[i]==boisson) {
				ca=ca+boisson.getPrix();
			}
			if(tableau[i]==cocktail) {
				ca=ca+Cocktail.calculerPrixCocktail(cocktail);
			}
			for(i=0;i<tableau[i].ingredient.length;i++) {
				ca=ca+ingredients.getPrix();
			}
		}
			
	}
		
