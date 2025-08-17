package com.cytech.ingredients;

public class Boisson implements Produits {
	private String nom ;// Attribut privé de type String
    private int stock ;
    private float prix ;
    private float degreAlcool;
    private float degreSucre;
    private String type;
    
    
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String getNom() {
        return nom;
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
    
    
    public Boisson(String nom , double prix) {
        this.nom = nom;
        this.prix=prix;
        this.stock=stock;
        super(nom);
        if ( degreAlchool > 0){
            this.type = "alcoolisé";
        }
        else{
            this.type= "nonAlcoolisé";
        }
    }
    @Override
    public void setDegreAlcool (float degreAlcool ){
    	this.degreAlcool= degreAlcool;
     
    }
    @Override
    public float getDegreAlcool() {
    	return this.degreAlcool;	
    }
    
    
    @Override
    public void setDegreSucre(float degreSucre){
    	 this.degreSucre = degreSucre;
    }
    @Override
    public float getDegreSucre() {
		 return this.degreSucre;
	 }
    
    public String getType() {
    	return this.type;
    }
    
    public void setType(String type) {
    	this.type=type;
    	
    }
  

    
}
