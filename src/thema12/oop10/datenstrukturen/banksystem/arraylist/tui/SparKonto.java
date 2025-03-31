package thema12.oop10.datenstrukturen.banksystem.arraylist.tui;

public class SparKonto extends Bankkonto {
    public SparKonto(int kontonummer, double kontostand) {
        super(kontonummer, kontostand);
    }

    @Override
    public String getKontoart() {
        return "SparKonto";
    }

    @Override
    public String toString() {
        return super.toString() + "\nKontoart: " + getKontoart();
    }
}
