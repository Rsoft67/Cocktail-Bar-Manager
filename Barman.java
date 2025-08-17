import package.Cocktail
import package.Commande
import package.Boisson

public class Barman extends Clients{
   
    Cocktail instance= new Cocktail();
    Commande instance1=new Commande();
    Boisson boisson= new Boisson();
    Arraylist<Boisson> tableauStock = new ArrayList<>(); 
   
   
public Barman(String nom, String prenom, String adresseMail, String dateNaissance, String phraseSecrète) { //Constructeur de Barman
      super(nom, prenom, adresseMail, dateNaissance, phraseSecrète); //Le barman est un Client  
   }
   
   @Override
public void gérerStock(ArrayList<Boisson> tableauBoisson) {
    for(int i=0; i<tableauBoisson.length; i++) {
         if(tableauBoisson[i].getStock<=0) {
            //ne plus proposer la boisson.
         }
    }
}

private void afficherCaractéristique(Boisson boisson) {
         System.out.printIn("Le degré d'alcoolémie est :" +boisson.getDegreAlcool());
         System.out.printIn("Le prix est : " +boisson.getPrix());
         System.out.printIn("La sucrosité est :" +boisson.getDegreSucre());
         System.out.printIn("Le stock est : " +getStock());
         System.out.printIn("La contenance est +" getContenance());
}
        




 
public void afficherChiffre() {
 double chiffreAffaires = Commande.calculerChiffreAffaires(tableauDeCommande);
 System.out.printIn("Le chiffre d'affaires est :" + chiffreAffaires);

}
}
