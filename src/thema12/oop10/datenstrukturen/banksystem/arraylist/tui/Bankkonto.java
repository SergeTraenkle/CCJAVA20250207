package thema12.oop10.datenstrukturen.banksystem.arraylist.tui;

public abstract class Bankkonto {
    protected int kontonummer;
    protected double kontostand;

    public Bankkonto(int kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public abstract String getKontoart();

    @Override
    public String toString() {
        return "Kontonummer: " + kontonummer + "\nKontostand: " + String.format("%.2f", kontostand) + " EUR";
    }
}
