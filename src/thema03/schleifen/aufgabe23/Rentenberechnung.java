package thema03.schleifen.aufgabe23;

public class Rentenberechnung {
    public static void main(String[] args) {
        // Festlegen der Eingabewerte direkt im Code
        double kapital = 10000.0;  // Anfangskapital
        double zinssatz = 5.0 / 100; // Zinssatz (in Dezimalform, z. B. 5% = 0.05)
        //double rente = 1500.0;     // Jährliche Rente
        double rente = 1500.0;     // Jährliche Rente

        // Überprüfung der Bedingung: Rente muss größer als Kapital * Zinssatz sein
        if (rente <= kapital * zinssatz) {
            System.out.println("Die Rente muss größer als Kapital x Zinssatz sein! Programm wird beendet.");
            return;
        }

        // Berechnung der Laufzeit
        int jahre = 0;
        while (kapital > 0) {
            jahre++;
            kapital += kapital * zinssatz; // Kapital wird verzinst
            kapital -= rente;             // Rente wird abgezogen

            // Ausgabe des Kapitals am Ende des Jahres
            if (kapital > 0) {
                System.out.printf("Nach Jahr %d: Kapital = %.2f EUR%n", jahre, kapital);
            } 
            else {
                System.out.printf("Nach Jahr %d: Kapital aufgebraucht.%n", jahre);
            }
        }

        // Ergebnis ausgeben
        System.out.println("------------------------------");
        System.out.printf("Das Kapital reicht für %d Jahre.%n", jahre);
    }
}

