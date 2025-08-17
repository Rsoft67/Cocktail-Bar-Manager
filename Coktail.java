import java.util.ArrayList;

public class  Coktail implements Produits {
	
    private String nom ;
    private int stock ;
    private float prix ;
    private float degreAlcool;
    private float degreSucre;
    private ArrayList<Produits> cocktail = new ArrayList<>();
   
    
    
    
    
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    

	@Override
	
	 public void setPrix () {
		 for( Produits prod: cocktail) {
				this.prix=this.prix+prix.cocktail;
			}
	}
	 
    @Override
    public float getPrix() {
        return this.prix;
    }
    @Override
    public void setStock(int stock) {
    	if (nom.Coktail != null && (nom.Coktail).length() > 0) {:
			this.stock=stock;
		} else {
			this.stock=0;
		   
		}
    }
    @Override
    public int getStock() {
        return this.stock;
    }
    

	public void Coktail (Produits[] args) {
		for ( Produits prod : args) {
			coktail.add( args);
		}	
	}
	
	

	@Override
	public void setDegreSucre( ) {
		for( Produits prod: cocktail) {
			this.degreSucre=this.degreSucre+degreSucre.cocktail;
		}
	}
		
	@Override
	public float getDegreSucre(){
			 return this.degreSucre;
		    }
			
	@Override
	public void setDegreAlcool() {
		for( Produits prod: cocktail) {
			this.degreAlcool=this.degreAlcool+degreAlcool.cocktail;
		}
	}
		
	@Override;
	public float getDegreAlcool() {
			 return this.degreAlcool;
		 }
	
	public void addProduit(Produits[]... args) {
		for ( Produits prod : args) {
			cocktail.add(prod);
			this.degreAlcool+=prod.getDegreAlcool();
			this.degreSucre+= prod.getDegreSucre();
			this.prix+=prod.getPrix();
			
		}
	}
	
	public void deleteProduit(Produits[] args) {
		for ( Produits prod : args) {
			cocktail.remove(prod);
			this.degreAlcoo-=prod.getDegreAlcool();
			this.degreSucre-= prod.getDegreSucre();
			this.prix-=prod.getPrix();
			
		}
	}
	
	
	

}
