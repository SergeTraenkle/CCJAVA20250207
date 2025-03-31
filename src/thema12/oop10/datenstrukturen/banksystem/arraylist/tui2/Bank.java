package thema12.oop10.datenstrukturen.banksystem.arraylist.tui2;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Bankkonto> konten;

    public Bank() {
        konten = new ArrayList<>();
    }

    public void kontoHinzufuegen(Bankkonto konto) {
        konten.add(konto);
        System.out.println("Konto hinzugefügt: " + konto);
    }

    public void kontoEntfernen(String kontonummer) {
        for (int i = 0; i < konten.size(); i++) {
            if (konten.get(i).getKontonummer().equals(kontonummer)) {
                konten.remove(i);
                System.out.println("Konto mit Kontonummer " + kontonummer + " entfernt.");
                return;
            }
        }
        System.out.println("Konto mit Kontonummer " + kontonummer + " nicht gefunden.");
    }

    public Bankkonto getKonto(String kontonummer) {
        for (Bankkonto konto : konten) {
            if (konto.getKontonummer().equals(kontonummer)) {
                return konto;
            }
        }
        return null;
    }

    public void zeigeAlleKonten() {
        System.out.println("\nAlle Konten:");
        for (Bankkonto konto : konten) {
            System.out.println(konto);
        }
    }
}
