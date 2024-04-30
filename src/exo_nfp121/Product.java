package exo_nfp121;

public class Product {
	String marque;
	String modele;
	String os;
	int prix;
	
	public Product(String marque, String modele, String os, int prix) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.os = os;
		this.prix = prix;
	}
	
	public Product(String marque, String modele, int prix) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}
	
	
}
