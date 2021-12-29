package Exercice1Serie4;

public class test1 {

	public static void main(String[] args) {
		Pile p = new Pile();
		try {
		for(int i=0;i<args.length;i++) p.empile(args[i]);
		}
		
		catch(PilePleine e) {};
		try {
		for(;;) System.out.print(p.depile()+" ");
		}
		catch(PileVide e) { System.out.println(); }
		}

	}


