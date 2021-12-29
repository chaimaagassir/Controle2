package Exercice1Serie4;

class PilePleine extends Exception{
	PilePleine(String s) { 
	   super(s);
	   }
}


class PileVide extends Exception{
	PileVide(String s) { 
		super(s);
		}
}

class Pile{
	private final static int taille = 10;
	private Object [] pile;
	private int pos;
	Pile() { pile=new Object[taille];
	pos=0; 
	}

 public void empile(Object o) throws PilePleine{
	try {
		pile[pos]=o;
		pos++;
	}
	catch(ArrayIndexOutOfBoundsException e){
		throw new PilePleine("La pile est  pleine!");
	}
 }

 public Object depile() throws PileVide{
	try {
		Object o = pile[pos-1];
		pos--;
		return o;
	}
	catch(ArrayIndexOutOfBoundsException e){
		throw new PileVide("La pile est vide!");
	}
 }
 
 }

