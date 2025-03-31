package thema02.datentypen.aufgabe1.bmi;

public class BodyMassIndex {

    public static void main(String[] args) {
        // Eingabewerte (Gewicht in Kilogramm und Größe in Metern)
        double gewicht = 70.0; // Beispiel: 70 kg
        double groesse = 1.75; // Beispiel: 1,75 m

        // Berechnung des BMI
        double bmi = berechneBMI(gewicht, groesse);

        // Ausgabe des Ergebnisses
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
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Interpretation: Normalgewicht");
        } 
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Interpretation: Übergewicht");
        } 
        else {
            System.out.println("Interpretation: Adipositas");
        }
    }
}