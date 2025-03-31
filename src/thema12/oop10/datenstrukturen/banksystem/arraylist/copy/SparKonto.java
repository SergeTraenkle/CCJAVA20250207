package thema12.oop10.datenstrukturen.banksystem.arraylist.copy;

//SparKonto.java (Erweiterung von Bankkonto)

public class SparKonto extends Bankkonto {
 private double zinssatz; // Zinssatz für das Sparkonto

 // Konstruktor: Initialisiert ein neues SparKonto-Objekt
 public SparKonto(String kontonummer, double kontostand, double zinssatz) {
     super(kontonummer, kontostand); // Ruft den Konstruktor der Basisklasse (Bankkonto) auf
     this.zinssatz = zinssatz;
 }

 // Getter-Methode für den Zinssatz
 public double getZinssatz() {
     return zinssatz;
 }

 // Überschreibt die toString()-Methode, um eine informative Darstellung des Sparkontos zu erzeugen
 @Override
 public String toString() {
     return super.toString() + ", Zinssatz: " + zinssatz + "%"; // Ruft die toString()-Methode der Basisklasse auf und fügt den Zinssatz hinzu
 }
}
