package thema09.oop4.vererbung.koenigfamilie;

public class Darlehensvertrag {
    private String vertragId;
    private Kunde kreditnehmer;
    private double kreditbetrag;
    private double zinssatz;
    private int laufzeit;

    public Darlehensvertrag(String vertragId, Kunde kreditnehmer, double kreditbetrag, double zinssatz, int laufzeit) {
        this.vertragId = vertragId;
        this.kreditnehmer = kreditnehmer;
        this.kreditbetrag = kreditbetrag;
        this.zinssatz = zinssatz;
        this.laufzeit = laufzeit;
    }

    public double berechneMonatlicheRate() {
        double monatlicherZins = zinssatz / (100 * 12);
        double rate = kreditbetrag * monatlicherZins / (1 - Math.pow(1 + monatlicherZins, -laufzeit));
        return rate;
    }

    @Override
    public String toString() {
        return String.format("Darlehensvertrag: Vertrag ID: %s, Kreditnehmer: %s, Kreditbetrag: %.2f EUR, Zinssatz: %.1f%%, Laufzeit: %d Monate, Monatliche Rate: %.2f EUR",
                vertragId, kreditnehmer.getName(), kreditbetrag, zinssatz, laufzeit, berechneMonatlicheRate());
    }
}

public class Main {
    public static void main(String[] args) {
        Kunde maxMustermann = new Kunde("Max Mustermann");
        Darlehensvertrag vertrag = new Darlehensvertrag("D001", maxMustermann, 10000.0, 5.0, 12);
        System.out.println(vertrag);
    }
}
