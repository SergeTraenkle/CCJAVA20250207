package thema12.oop7.datenstrukturen.arraylist;

import java.util.ArrayList;

public class MainProgram {
 
	public static void main(String[] args) {
 
		ArrayList<String> namenListe = new ArrayList<String>();
		namenListe.add("Serge");
		namenListe.add("Peter");
		namenListe.add("Markus");
		namenListe.add("Lisa");
		namenListe.add("Serge");
		
		for (String string : namenListe) {
			System.out.println(string);
		}
	}
}
 