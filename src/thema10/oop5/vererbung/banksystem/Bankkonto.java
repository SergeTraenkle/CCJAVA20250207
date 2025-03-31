package thema10.oop5.vererbung.banksystem;

//Basisklasse Bankkonto
public abstract class Bankkonto {
	protected String kontonummer;
	protected double kontostand;

	public Bankkonto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	public void einzahlen(double betrag) {
		kontostand += betrag;
	}

	public void abheben(double betrag) {
	   if (kontostand >= betrag) {
	       kontostand -= betrag;
	    } else {
	    	System.err.println("Nicht genügend Guthaben");
	   }
	}
	
	@Override
	public String toString() {
		return String.format("Kontonummer: %s, Kontostand: %.1f EUR", kontonummer, kontostand);
	}
}