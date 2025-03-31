package thema12.oop10.datenstrukturen.banksystem.arraylist.tui2;

public class GiroKonto extends Bankkonto {
    private double dispoLimit;

    public GiroKonto(String kontonummer, double kontostand, double dispoLimit) {
        super(kontonummer, kontostand);
        this.dispoLimit = dispoLimit;
    }

    public double getDispoLimit() {
        return dispoLimit;
    }

    @Override
    public void abheben(double betrag) {
        if (getKontostand() + dispoLimit >= betrag) {
            super.abheben(betrag);
        } else {
            System.out.println("Dispo-Limit überschritten.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Dispo-Limit: " + String.format("%.2f", dispoLimit) + " EUR";
    }
}
