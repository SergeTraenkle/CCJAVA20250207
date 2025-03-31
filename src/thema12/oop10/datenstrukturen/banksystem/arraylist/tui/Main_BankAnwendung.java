package thema12.oop10.datenstrukturen.banksystem.arraylist.tui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main_BankAnwendung {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Automatische Kontoerstellung
        for (int i = 0; i < 5; i++) {
            int kontonummer = 100000 + random.nextInt(900000); // 6-stellige Kontonummer
            double kontostand = 1000 + random.nextDouble() * 9000; // Kontostand zwischen 1000 and 10000
            Bankkonto konto;
            if (random.nextBoolean()) {
                konto = new SparKonto(kontonummer, kontostand);
            } else {
                konto = new GiroKonto(kontonummer, kontostand);
            }
            bank.kontoHinzufuegen(konto);
        }

        // Benutzermenü
        int option = 0;
        while (option != 5) {
            System.out.println("\nWillkommen beim Bankensystem");
            System.out.println("1. Konto hinzufügen");
            System.out.println("2. Konto anzeigen");
            System.out.println("3. Alle Konten anzeigen");
            System.out.println("4. Konto löschen");
            System.out.println("5. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            try {
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        // Konto hinzufügen
                        System.out.print("Kontonummer: ");
                        int neueKontonummer = scanner.nextInt();
                        // Überprüfen, ob die Kontonummer bereits existiert
                        if (bank.getKonto(neueKontonummer) != null) {
                            System.out.println("Fehler: Ein Konto mit dieser Kontonummer existiert bereits.");
                            break; // Zurück zum Hauptmenü
                        }

                        System.out.print("Kontostand: ");
                        double neuerKontostand = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline left by nextDouble()

                        System.out.print("Kontoart (1 für SparKonto, 2 für GiroKonto): ");
                        int kontoart = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        Bankkonto neuesKonto;
                        if (kontoart == 1) {
                            neuesKonto = new SparKonto(neueKontonummer, neuerKontostand);
                        } else if (kontoart == 2) {
                            neuesKonto = new GiroKonto(neueKontonummer, neuerKontostand);
                        } else {
                            System.out.println("Ungültige Kontoart. Konto wurde nicht hinzugefügt.");
                            break;
                        }
                        bank.kontoHinzufuegen(neuesKonto);
                        System.out.println("Konto erfolgreich hinzugefügt.");
                        break;

                    case 2:
                        // Konto anzeigen
                        System.out.print("Geben Sie die Kontonummer ein: ");
                        int kontonummer = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        Bankkonto konto = bank.getKonto(kontonummer);
                        if (konto != null) {
                            System.out.println(konto);
                        } else {
                            System.out.println("Konto nicht gefunden.");
                        }
                        break;

                    case 3:
                        // Alle Konten anzeigen
                        ArrayList<Bankkonto> alleKonten = bank.getAlleKonten();
                        if (alleKonten.isEmpty()) {
                            System.out.println("Es sind keine Konten vorhanden.");
                        } else {
                            System.out.println("Alle Konten:");
                            for (Bankkonto k : alleKonten) {
                                System.out.println(k);
                            }
                        }
                        break;

                    case 4: // Konto löschen (jetzt hinzugefügt)
                        System.out.print("Geben Sie die zu löschende Kontonummer ein: ");
                        int zuLoeschendeKontonummer = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        bank.kontoLoeschen(zuLoeschendeKontonummer);
                        break;

                    case 5:
                        System.out.println("Das Programm wird beendet.");
                        break;

                    default:
                        System.out.println("Ungültige Option. Bitte wählen Sie eine Zahl zwischen 1 und 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Fehler: Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                scanner.nextLine(); // Leere den Scanner-Puffer, um eine Endlosschleife zu vermeiden
                option = 0; // Setze option zurück, damit die Schleife weiterläuft.
            }
        }
        scanner.close(); //Scanner schließen, wenn er nicht mehr gebraucht wird.
    }
}
