package thema12.oop10.datenstrukturen.banksystem.arraylist.tui2;

public abstract class Bankkonto {
    private String kontonummer;
    private double kontostand;

    public Bankkonto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public void abheben(double betrag) {
        if (kontostand >= betrag) {
            kontostand -= betrag;
        } else {
            System.out.println("Nicht genügend Guthaben.");
        }
    }

    @Override
    public String toString() {
        return "Kontonummer: " + kontonummer + ", Kontostand: " + String.format("%.2f", kontostand) + " EUR";
    }
}
