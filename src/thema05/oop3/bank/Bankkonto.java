package thema05.oop3.bank;

public class Bankkonto {
    private String kontonummer;
    private double kontostand;
    private Kunde kontoinhaber;
    
    public Bankkonto(String kontonummer, double anfangsKontostand, Kunde kontoinhaber) {
        this.kontonummer = kontonummer;
        this.kontostand = anfangsKontostand;
        this.kontoinhaber = kontoinhaber;
        Bank.erhoeheAnzahlKonten();
    }
    
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        }
    }
    
    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
        }
    }
/*    
    @Override
    public String toString() {
        return "Konto: " + kontonummer + ", Inhaber: " + kontoinhaber.getName() + 
               ", Kontostand: " + String.format("%.2f", kontostand) + " EUR";
    }
*/    
    @Override
    public String toString() {
        return String.format("Konto: %-6s, Inhaber: %-14s, Kontostand: %.2f EUR",
            kontonummer,
            kontoinhaber.getName(),
            kontostand);
    }
    
}
