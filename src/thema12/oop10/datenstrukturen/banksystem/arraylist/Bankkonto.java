package thema12.oop10.datenstrukturen.banksystem.arraylist;

//Bankkonto.java (Basisklasse für Konten)

public class Bankkonto {
 private String kontonummer; // Kontonummer des Bankkontos
 private double kontostand;  // Aktueller Kontostand

 // Konstruktor: Initialisiert ein neues Bankkonto-Objekt
 public Bankkonto(String kontonummer, double kontostand) {
     this.kontonummer = kontonummer;
     this.kontostand = kontostand;
 }

 // Getter-Methode für die Kontonummer
 public String getKontonummer() {
     return kontonummer;
 }

 // Getter-Methode für den Kontostand
 public double getKontostand() {
     return kontostand;
 }

 // Methode zum Einzahlen eines Betrags auf das Konto
 public void einzahlen(double betrag) {
     kontostand += betrag; // Erhöht den Kontostand um den Einzahlungsbetrag
 }

 // Methode zum Abheben eines Betrags vom Konto
 public void abheben(double betrag) {
     if (kontostand >= betrag) { // Überprüft, ob genügend Guthaben vorhanden ist
         kontostand -= betrag;  // Reduziert den Kontostand um den Abhebungsbetrag
     } else {
         System.out.println("Nicht genügend Guthaben."); // Gibt eine Fehlermeldung aus, wenn nicht genügend Guthaben vorhanden ist
     }
 }

 // Überschreibt die toString()-Methode, um eine informative Darstellung des Bankkontos zu erzeugen
 @Override
 public String toString() {
     return "Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + " EUR";
 }
}
