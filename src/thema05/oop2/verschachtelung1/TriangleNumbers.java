package thema05.oop2.verschachtelung1;
/*
 * Schreiben ein Java-Programm, das Dreieckszahlen bis zu einer angegebenen maximalen Grenze berechnet 
 * und sie anschließend darstellt. Das Programm soll die Dreieckszahlen bis zur maximalen Grenze ausgeben, 
 * wobei jede Zeile die schrittweise Berechnung einer Dreieckszahl zeigt.
 */
import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der maximalen Grenze
        System.out.print("Geben Sie die maximale Zahl ein: ");
        int max = scanner.nextInt();

        int n = 1; // Startwert für die Berechnung der Dreieckszahlen
        int sum = 0; // Variable für die Summe der Dreieckszahlen

        // Berechnung und Ausgabe der Dreieckszahlen
        while (sum + n <= max) { // Bedingung: Summe darf die maximale Grenze nicht überschreiten
            sum += n;
            printTriangleRow(n, sum);
            n++;
        }
    }

    // Methode zur Berechnung und Ausgabe einer Dreieckszahl: Dreieckreihe drucken
    public static void printTriangleRow(int n, int sum) {
        StringBuilder row = new StringBuilder();

        // Verschachtelte Schleife für die Berechnung und Darstellung
        // DreiecksZahli = i*(i + 1)/2
        for (int i = 1; i <= n; i++) {
            row.append(i);

            if (i < n) {
                row.append(" + ");
            }
        }

        row.append(" = ").append(sum);

        // Zentrierte Ausgabe
        printCentered(row.toString());
    }

    // Methode zum Zentrieren der Ausgabe
    public static void printCentered(String text) {
        int consoleWidth = 50; // variable Breite der Konsole
        int padding = (consoleWidth - text.length()) / 2;

        // vorangestellte Leerzeichen für Zentrierung
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }

        System.out.println(text);
    }
}