package thema05.oop2.verschachtelung1;

import java.util.Scanner;

public class SternenPyramide {
    public static void main(String[] args) {
        // Scanner für Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Höhe der Pyramide einlesen
        System.out.print("Geben Sie die Höhe der Pyramide ein: ");
        int hoehe = scanner.nextInt();

        // Pyramide zeichnen
        for (int i = 1; i <= hoehe; i++) { // i: entspricht der Zeilen-Nummer
            // Leerzeichen vor den Sternen ausgeben
            for (int j = 1; j <= hoehe - i; j++) { // j: Leerzeichen vor den Sternen 
                System.out.print(" ");
            }

            // Sterne ausgeben
            for (int k = 1; k <= (2 * i - 1); k++) { // k: Anzahl der Sterne in jeder Zeile
                System.out.print("*");
            }

            // Neue Zeile nach jeder Reihe
            System.out.println();
        }

        scanner.close();
    }
}
