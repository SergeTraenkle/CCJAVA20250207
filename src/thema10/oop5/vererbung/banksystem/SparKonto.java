package thema10.oop5.vererbung.banksystem;

//Subklasse SparKonto
public class SparKonto extends Bankkonto {
	private static final double ZINSSATZ = 2.0;

// Konstruktor der Klasse SparKonto
	public SparKonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}

	public void zinsenBerechnen() {
		double zinsbetrag = kontostand * ZINSSATZ / 100;
		kontostand += zinsbetrag;
	}

	@Override
	public String toString() {
		return super.toString() + ", Zinssatz: " + ZINSSATZ + "%";
	}
}
