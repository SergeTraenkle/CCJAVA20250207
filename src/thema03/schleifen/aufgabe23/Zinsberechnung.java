package thema03.schleifen.aufgabe23;

import utils.IO;

public class Zinsberechnung {
    public static void main(String[] args) {
        // Festlegen der Eingabewerte
        double kapital = 1000.0;  // Anzulegendes Kapital
        double zinssatz = 0.05;  // Zinssatz (z.B. 5% = 0.05)
        int laufzeit = 3;        // Laufzeit der Geldanlage in Jahren

        System.out.println("\nJährliche Kapitalentwicklung:");
        System.out.println("------------------------------");

        // Schleife zur Berechnung des Kapitals pro Jahr
        for (int jahr = 1; jahr <= laufzeit; jahr++) {
            kapital = kapital + kapital * zinssatz;  // Kapital wird verzinst
            
            // Kapital auf zwei Dezimalstellen runden
            // double gerundetesKapital = Math.round(kapital * 100.0) / 100.0;
            double gerundetesKapital = IO.round(kapital, 2);
            //System.out.println("Jahr " + jahr + ":\t\t" + gerundetesKapital + " EUR");
            System.out.printf("Jahr %d:\t\t%.2f EUR%n", jahr, kapital);
        }
    }
}
