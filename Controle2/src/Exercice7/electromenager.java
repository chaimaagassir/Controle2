package Exercice7;
import java.util.Date;

public class electromenager extends Article implements VendueSolde{
	
	private String marque;
	private String voltage;
	
	//constructeurs
	public electromenager() {
		super();
		
	}



	public electromenager(String marque, String voltage) {
		super();
		this.marque = marque;
		this.voltage = voltage;
	}


	@Override
	public String toString() {
		return "Electroménagers [voltage=" + voltage + ", marque=" + marque + ", prix_achat=" + prixachat
				+ ", prix_vente=" + prixvente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";				
	}
	
	
	//methodes
	public int lancersolde(float pers1) {
		 prixvente = prixachat - (prixachat * pers1 /100) ;
		 return prixvente;
		
	}
	

	public int terminersolde(float pers2) {
		prixvente = prixachat + (prixachat * pers2 /100) ;
		return prixvente;
		
	}

}
