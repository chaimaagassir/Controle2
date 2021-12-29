package Exercice2Serie4;
import java.util.*;
public class Enfant {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    boolean tryAgain = true;
		  do {
		       try {
		            System.out.println("Entrer un entier entre 1 et 10 ");

		            int inInt = input.nextInt();

		            if (inInt >= 1 && inInt <= 10){
		                System.out.println("Merci");
		                tryAgain = false;
		            }
		            else if (inInt < 1 || inInt > 10){
		                throw new NumberFormatException("L'entier que vous avez entré est hors de portée");
		            }
		        }
		        catch (NumberFormatException e1) { 
		            System.out.println("* L'entier que vous avez entré est hors de portée .Essayez encore!");
		            System.out.println();
		            input.nextLine();
		        }
		       catch (InputMismatchException e2) { 
		            System.out.println("* Entrer un entier");
		            System.out.println();
		            input.nextLine();
		        }
		    } while(tryAgain);
		}

	
	

}
