package thema12.oop10.datenstrukturen.banksystem.arraylist.tui2;

import java.util.Random;
import java.util.Scanner;

public class Main_BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Willkommen beim Bankensystem!");

        boolean running = true;
        while (running) {
            System.out.println("\nMenü:");
            System.out.println("1. Konto hinzufügen");
            System.out.println("2. Konto anzeigen");
            System.out.println("3. Alle Konten anzeigen");
            System.out.println("4. Konto löschen");
            System.out.println("5. Automatische Kontoerstellung");
            System.out.println("6. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Eingabepuffer leeren

            switch (option) {
                case 1: // Konto hinzufügen
                    System.out.print("Geben Sie die Kontonummer ein: ");
                    String kontonummer = scanner.nextLine();
                    System.out.print("Geben Sie den Startbetrag ein: ");
                    double kontostand = scanner.nextDouble();
                    scanner.nextLine(); // Eingabepuffer leeren

                    System.out.print("Kontoart wählen (1 = SparKonto, 2 = GiroKonto): ");
                    int kontoart = scanner.nextInt();
                    scanner.nextLine(); // Eingabepuffer leeren

                    if (kontoart == 1) {
                        System.out.print("Geben Sie den Zinssatz ein: ");
                        double zinssatz = scanner.nextDouble();
                        SparKonto sparKonto = new SparKonto(kontonummer, kontostand, zinssatz);
                        bank.kontoHinzufuegen(sparKonto);
                    } else if (kontoart == 2) {
                        System.out.print("Geben Sie das Dispo-Limit ein: ");
                        double dispoLimit = scanner.nextDouble();
                        GiroKonto giroKonto = new GiroKonto(kontonummer, kontostand, dispoLimit);
                        bank.kontoHinzufuegen(giroKonto);
                    } else {
                        System.out.println("Ungültige Kontoart.");
                    }
                    break;

                case 2: // Konto anzeigen
                    System.out.print("Geben Sie die Kontonummer ein: ");
                    String suchKontonummer = scanner.nextLine();
                    Bankkonto gefundenesKonto = bank.getKonto(suchKontonummer);
                    if (gefundenesKonto != null) {
                        System.out.println("\nGefundenes Konto: " + gefundenesKonto);
                    } else {
                        System.out.println("Konto nicht gefunden.");
                    }
                    break;

                case 3: // Alle Konten anzeigen
                    bank.zeigeAlleKonten();
                    break;

                case 4: // Konto löschen
                    System.out.print("Geben Sie die Kontonummer ein, die gelöscht werden soll: ");
                    String loeschKontonummer = scanner.nextLine();
                    bank.kontoEntfernen(loeschKontonummer);
                    break;

                case 5: // Automatische Kontoerstellung
                    System.out.print("Wie viele Konten sollen erstellt werden? ");
                    int anzahl = scanner.nextInt();
                    scanner.nextLine(); // Eingabepuffer leeren

                    for (int i = 0; i < anzahl; i++) {
                        String randomKontonummer = String.format("%06d", random.nextInt(1000000));
                        double randomStartguthaben = 1000 + (random.nextDouble() * (10000 - 1000));
                        if (random.nextBoolean()) {
                            // SparKonto erstellen
                            double randomZinssatz = 1 + (random.nextDouble() * 4); // Zinssatz zwischen 1% und 5%
                            SparKonto sparKonto = new SparKonto(randomKontonummer, randomStartguthaben, randomZinssatz);
                            bank.kontoHinzufuegen(sparKonto);
                        } else {
                            // GiroKonto erstellen
                            double randomDispoLimit = 500 + (random.nextDouble() * 1500); // Dispo zwischen 500 und 2000 EUR
                            GiroKonto giroKonto = new GiroKonto(randomKontonummer, randomStartguthaben, randomDispoLimit);
                            bank.kontoHinzufuegen(giroKonto);
                        }
                    }
                    System.out.println(anzahl + " Konten wurden automatisch erstellt.");
                    break;

                case 6: // Beenden
                    System.out.println("Programm beendet.");
                    break;

                default:
                    System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }
        }

        scanner.close();
    }
}
