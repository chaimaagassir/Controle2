package Exercice3Serie4;
import java.util.*;
public class Ville extends Exception {
	
	private String nom;
	private int population;
	private String pays;
	    Ville(String s)
	    {
	        super(s);
	    }
	}
	

class erreur
	{
	    static private String posInteger(String population) throws Ville 
	    {
	        if (Integer.valueOf(population) >= 0)
	            {
	                return population;
	            }
	        else 
	            {
	                throw new Ville("Erreur, le nombre ne peut pas etre négatif");
	            }
	        }
	

public static void main(String[] args)
{
   String r;
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   try
   {
       r=erreur.posInteger(s);
   }
   catch(Exception e)
   {
       System.out.println(e.getMessage());
       return;
   }
   System.out.println(r);
}
}


