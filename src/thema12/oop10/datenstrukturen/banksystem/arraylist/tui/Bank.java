package thema12.oop10.datenstrukturen.banksystem.arraylist.tui;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Bankkonto> konten;

    public Bank() {
        konten = new ArrayList<>();
    }

    public void kontoHinzufuegen(Bankkonto konto) {
        konten.add(konto);
    }

    public void kontoLoeschen(int kontonummer) {
        Bankkonto kontoZumLoeschen = null;
        for (Bankkonto konto : konten) {
            if (konto.getKontonummer() == kontonummer) {
                kontoZumLoeschen = konto;
                break;
            }
        }
        if (kontoZumLoeschen != null) {
            konten.remove(kontoZumLoeschen);
            System.out.println("Konto mit der Kontonummer " + kontonummer + " wurde gelöscht.");
        } else {
            System.out.println("Konto mit der Kontonummer " + kontonummer + " nicht gefunden.");
        }
    }

    public Bankkonto getKonto(int kontonummer) {
        for (Bankkonto konto : konten) {
            if (konto.getKontonummer() == kontonummer) {
                return konto;
            }
        }
        return null;
    }

    public ArrayList<Bankkonto> getAlleKonten() {
        return konten;
    }
}
