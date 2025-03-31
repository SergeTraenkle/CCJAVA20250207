package thema02.datentypen.aufgabe1.bmi;

import utils.IO;

public class BodyMassIndex2 {

    public static void main(String[] args) {
        // Eingabe des Namens
        String name = IO.promptAndReadString("Bitte Namen eingeben: ");
        
        // Eingabe des Gewichts
        String gewichtEingabe = IO.promptAndReadString("Bitte Gewicht in Kilogramm eingeben: ");
        double gewicht = Double.parseDouble(gewichtEingabe);

        // Eingabe der Größe
        String groesseEingabe = IO.promptAndReadString("Bitte Größe in Metern eingeben: ");
        double groesse = Double.parseDouble(groesseEingabe);

        // Berechnung des BMI
        double bmi = berechneBMI(gewicht, groesse);

        // Ausgabe der Ergebnisse
        System.out.println("\n--- BMI-Berechnung ---");
        System.out.println("Name: " + name);
        System.out.printf("Gewicht: %.2f kg\n", gewicht);
        System.out.printf("Größe: %.2f m\n", groesse);
        System.out.printf("Ihr BMI beträgt: %.2f\n", bmi);

        // Interpretation des BMI-Werts
        interpretiereBMI(bmi);
    }

    // Methode zur Berechnung des BMI
    public static double berechneBMI(double gewicht, double groesse) {
        return gewicht / (groesse * groesse);
    }

    // Methode zur Interpretation des BMI
    public static void interpretiereBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Interpretation: Untergewicht");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Interpretation: Normalgewicht");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Interpretation: Übergewicht");
        } else {
            System.out.println("Interpretation: Adipositas");
        }
    }
} 