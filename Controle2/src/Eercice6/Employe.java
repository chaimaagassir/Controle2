package Eercice6;
 import java.util.Date ;
 abstract class Employe {
	private int matricule;
	private String nom;
	private String prenom;
	private DateTime datenaissance;
	
	//Le premier constructeur 
	public Employe() {
		super();
		
	}

     //Le deuxieme constructeur
	public Employe(int matricule, String nom, String prenom, DateTime datenaissance) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}
	
	//La méthode toString
	public String  ToString(){
        return "Matricule: " + matircule + " Nom: " + nom + " Prénom: " + prenom + "Date de naissance: " + datenaissance.ToShortDateString();
	}
	
	//La méthode abstract getSalaire
	public abstract double  getSalaire();
}

 class Ouvrier extends Employe{
	
	private DateTime dateentree;
	private double SMIG=3000;
	
	
	
	 public Ouvrier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ouvrier(DateTime dateentree, double sMIG) {
		super();
		this.dateentree = dateentree;
		SMIG = sMIG;
	}


	public override double getSalaire()
     {
         double salaire;
         int Anciennete = DateTime.Now.Year - dateentree.Year;
         if (dateentree.AddYears(Anciennete) > DateTime.Now.Date)
             Anciennete--;
         if (sMIG + Anciennete * 100 <= 2 * sMIG)
             salaire = sMIG + Anciennete * 100;
         else
             salaire = sMIG * 2;

         return salaire;        
     }


	public DateTime getDateentree() {
		return dateentree;
	}


	public void setDateentree(DateTime dateentree) {
		this.dateentree = dateentree;
	}


	public double getSMIG() {
		return SMIG;
	}


	public void setSMIG(double sMIG) {
		SMIG = sMIG;
	}
	 
}
 
 class Cadre extends Employe{
	 private int indice;

	public Cadre(int indice) {
		super();
		this.indice = indice;
	}

	
	

	public Cadre() {
		super();
		
	}




	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return super.ToString();
	}

	@Override
	public double getSalaire() {
		if (indice == 1)
            return 12000;
        else if (indice == 2)
            return 14000;
        else if (indice == 3)
            return 16000;
        else if (indice == 4)
            return 18000;
        else
            return -1;

		// TODO Auto-generated method stub
		
	}




	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	 
 }
 class Associe extends Employe{
	 private static double chiffreaffaire;
	 private double pourcentage;
	 
	public Associe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Associe(double pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	
	@Override
	public String toString() {
		return "Associe [pourcentage=" + pourcentage + ", getPourcentage()=" + getPourcentage() + "]";
	}


	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		 return Math.Round((ca * pourcentage / 100) / 12, 2);
		return 0;
	}

	public static double getChiffreaffaire() {
		return chiffreaffaire;
	}
	public static void setChiffreaffaire(double chiffreaffaire) {
		Associe.chiffreaffaire = chiffreaffaire;
	}
	public double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	 
	 
	 
 }
 
