package thema12.oop10.datenstrukturen.banksystem.arraylist;

//GiroKonto.java (Erweiterung von Bankkonto)
public class GiroKonto extends Bankkonto {
 private double dispoLimit; // Dispo-Limit für das Girokonto

 // Konstruktor: Initialisiert ein neues GiroKonto-Objekt
 public GiroKonto(String kontonummer, double kontostand, double dispoLimit) {
     super(kontonummer, kontostand); // Ruft den Konstruktor der Basisklasse (Bankkonto) auf
     this.dispoLimit = dispoLimit;
 }

 // Getter Methode für das Dispo-Limit
 public double getDispoLimit() {
     return dispoLimit;
 }

 // Überschreibt die abheben()-Methode der Basisklasse, um das Dispo-Limit zu berücksichtigen
 @Override
 public void abheben(double betrag) {
     if (getKontostand() + dispoLimit >= betrag) { // Überprüft, ob der Kontostand plus Dispo-Limit den Abhebungsbetrag abdeckt
         super.abheben(betrag); // Ruft die abheben()-Methode der Basisklasse auf, wenn genügend Deckung vorhanden ist
     } else {
         System.out.println("Dispo-Limit überschritten."); // Gibt eine Fehlermeldung aus, wenn das Dispo-Limit überschritten wird
     }
 }

 // Überschreibt die toString()-Methode, um eine informative Darstellung des Girokontos zu erzeugen
 @Override
 public String toString() {
     return super.toString() + ", Dispo-Limit: " + dispoLimit + " EUR"; // Ruft die toString()-Methode der Basisklasse auf und fügt das Dispo-Limit hinzu
 }
}

