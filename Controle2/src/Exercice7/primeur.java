package Exercice7;
import java.util.Date ;

public class primeur extends Article implements Produit {
	private Date dateperemption;

	public primeur(Date dateperemption) {
		super();
		this.dateperemption = dateperemption;
	}

	public primeur() {
		super();
		
	}



	@Override
	public String toString() {
		return "Primeurs [date_péremption=" + dateperemption + ", prix_achat=" + prixachat + ", prix_vente="
				+ prixvente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	
	@Override
	public Date dateperemption() {
		
		return null;
	}
	
	
	@Override
	public int joursrestants() {
		 Date date = new Date();
	      long date1InMs = date.getTime();
	      long date2InMs = dateperemption.getTime();

	      long timeDiff = 0;
	      if (date1InMs > date2InMs) {
	         timeDiff = date1InMs - date2InMs;
	      } else {
	         timeDiff = date2InMs - date1InMs;
	      }

	      int daysDiff = (int)(timeDiff / (1000 * 60 * 60 * 24));

	      
	      return daysDiff ;
	}
	

}
