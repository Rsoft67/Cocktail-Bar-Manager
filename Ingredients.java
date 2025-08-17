
public class Ingredients implements Produits {
	
	private String nom ;
    private int stock ;
    private float prix ;
    private float degreAlcool;
    private float degreSucre;
    
    
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    
    public String getNom() {
        return this.nom;
    }
    @Override
    
    public void setPrix( float prix ){
        this.prix=prix;
    }
    @Override
    
    public float getPrix() {
        return this.prix;
    }
    @Override
    
    public void setStock(int stock) {
    	this.stock=stock;
    }
	
    @Override
    public int getStock() {
        return this.stock;
    }
    
    
	public Ingredients (String nom , double prix) {
		 this.nom = nom;
	     this.prix=prix;
	}
	 @Override
	 public void setDegreAlcool (float degreAlcool ){
	    	this.degreAlcool= 0;
	     
	  }
	 @Override
	 public void setDegreSucre(float degreSucre){
		 this.degreSucre = 0;
	    }
	 
	 @Override
	 public float getDegreAlcool() {
		 return this.degreAlcool;
	 }
	

}
