package thema10.oop5.vererbung.banksystem;

//Subklasse GiroKonto
public class GiroKonto extends Bankkonto {
	private double dispoLimit;

	public GiroKonto(String kontonummer, double kontostand, double dispoLimit) {
		super(kontonummer, kontostand);
		this.dispoLimit = dispoLimit;
	}

	@Override
	public void abheben(double betrag) {
		if ((kontostand + dispoLimit) > betrag) {
			super.abheben(betrag);			
		}
		else {
			System.err.println("Dispolimit überschritten");
		}

	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dispo-Limit: " + dispoLimit + " EUR";
	}
}
