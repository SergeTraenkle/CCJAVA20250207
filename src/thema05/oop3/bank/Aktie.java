package thema05.oop3.bank;

public class Aktie {
    private String isin; // Die ISIN (International Securities Identification Number) der Aktie
    private String unternehmensname; // Name des Unternehmens, zu dem die Aktie gehört
    private double preis; // Aktueller Preis der Aktie in EUR
    
    // Konstruktor
    public Aktie(String isin, String unternehmensname, double preis) {
        this.isin = isin;
        this.unternehmensname = unternehmensname;
        this.preis = preis;
    }
    
    // Methode zum Aktualisieren des Preises (Setter)
    public void aktualisierePreis(double neuerPreis) {
        this.preis = neuerPreis;
    }
    
    @Override // Methoden-Überschreibung
    public String toString() {
        return String.format("Aktie: %-7s, Unternehmen: %-15s, Preis: %.2f EUR",
            isin,
            unternehmensname,
            preis);
    }
}
