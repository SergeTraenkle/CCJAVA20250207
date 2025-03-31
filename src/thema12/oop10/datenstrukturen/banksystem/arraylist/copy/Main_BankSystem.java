package thema12.oop10.datenstrukturen.banksystem.arraylist.copy;

public class Main_BankSystem  {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Konten hinzufügen
        SparKonto sparKonto = new SparKonto("111111", 3000, 2.0);
        GiroKonto giroKonto = new GiroKonto("222222", 1500, 500);

        bank.kontoHinzufuegen(sparKonto);
        bank.kontoHinzufuegen(giroKonto);
        // Alle Konten anzeigen
        bank.zeigeAlleKonten();

        // Konto entfernen
        bank.kontoEntfernen("111111");

        // Alle Konten nach Entfernung anzeigen
        bank.zeigeAlleKonten();

        // Konto abrufen
        Bankkonto gefundenesKonto = bank.getKonto("222222");
        if (gefundenesKonto != null) {
            System.out.println("\nGefundenes Konto: " + gefundenesKonto);
        } else {
            System.out.println("Konto nicht gefunden.");
        }

        // Nicht existierendes Konto abrufen
        String beispielKonto = "999999";
        Bankkonto nichtGefundenesKonto = bank.getKonto(beispielKonto);
        if (nichtGefundenesKonto != null) {
            System.out.println("\nGefundenes Konto: " + nichtGefundenesKonto);
        } else {
            System.out.println("Konto mit Kontonummer " + beispielKonto + " nicht gefunden.");
        }
    }
}
