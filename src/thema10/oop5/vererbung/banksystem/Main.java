package thema10.oop5.vererbung.banksystem;

//Hauptprogramm
public class Main {
	public static void main(String[] args) {

		// Erstellen eines Sparkontos: Kontonummer, Kontostand
		SparKonto sparkonto = new SparKonto("123456", 5000.0);
		
		sparkonto.einzahlen(300.0);
		sparkonto.zinsenBerechnen();
		System.out.println(sparkonto);
		System.out.println();

		// Erstellen eines GiroKontos: Kontonummer, Kontostand, Dispo-Limit
		GiroKonto girokonto = new GiroKonto("654321", 200.0, 500.0);
		
		girokonto.abheben(100.0);
		System.out.println(girokonto);
	}
}
