package thema12.oop10.datenstrukturen.banksystem.arraylist.tui;

public class GiroKonto extends Bankkonto {
    public GiroKonto(int kontonummer, double kontostand) {
        super(kontonummer, kontostand);
    }

    @Override
    public String getKontoart() {
        return "GiroKonto";
    }

    @Override
    public String toString() {
        return super.toString() + "\nKontoart: " + getKontoart();
    }
}
