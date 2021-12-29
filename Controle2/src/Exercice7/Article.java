package Exercice7;

public class Article {
	
	private int prixachat;
	private int prixvente;
	private String nom;
	private String fournisseur;
	
	//constructeurs
	
	public Article() {}
	
	public Article(int prixachat, int prixvente, String nom, String fournisseur) {
		super();
		this.prixachat = prixachat;
		this.prixvente = prixvente;
		this.nom = nom;
		this.fournisseur = fournisseur;
	}
	int calculetaux() {
		int taux;
		taux=prixvente - prixachat;
		return taux;
	}

	//methode d'affichage
	public String toString() {
		 return "Nom: " + nom + " Fournissaur: " + fournisseur + " Prix d'achat: " + prixachat + "Prix de vente: " + prixvente;
		
	}

	public int getPrixachat() {
		return prixachat;
	}

	public void setPrixachat(int prixachat) {
		this.prixachat = prixachat;
	}

	public int getPrixvente() {
		return prixvente;
	}

	public void setPrixvente(int prixvente) {
		this.prixvente = prixvente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	

}
