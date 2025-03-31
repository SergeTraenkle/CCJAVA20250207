package thema12.oop10.datenstrukturen.banksystem.arraylist.copy;

//Bank.java (Verwaltung der Konten mit ArrayList)
import java.util.ArrayList; // Importiert die ArrayList-Klasse

public class Bank {
 private ArrayList<Bankkonto> konten; // ArrayList zur Speicherung von Bankkonto-Objekten

 // Konstruktor: Initialisiert eine neue Bank-Instanz mit einer leeren Kontenliste
 public Bank() {
     konten = new ArrayList<>();
 }

 // Methode zum Hinzufügen eines neuen Kontos zur Bank
 public void kontoHinzufuegen(Bankkonto konto) {
     konten.add(konto); // Fügt das Konto der ArrayList hinzu
     System.out.println("Konto hinzugefügt: " + konto); // Gibt eine Bestätigung aus, dass das Konto hinzugefügt wurde
 }

 // Methode zum Entfernen eines Kontos anhand der Kontonummer
 public void kontoEntfernen(String kontonummer) {
     for (int i = 0; i < konten.size(); i++) { // Durchläuft die ArrayList mit einer for-Schleife
         if (konten.get(i).getKontonummer().equals(kontonummer)) { // Überprüft, ob die Kontonummer übereinstimmt
             konten.remove(i); // Entfernt das Konto an der gefundenen Position aus der ArrayList
             // Gibt eine Bestätigung aus, dass das Konto entfernt wurde
             System.out.println("\nKonto mit Kontonummer " + kontonummer + " entfernt."); 
             return; // Beendet die Methode, nachdem das Konto entfernt wurde
         }
     }
     // Gibt eine Meldung aus, wenn kein Konto mit der angegebenen Kontonummer gefunden wurde
     System.out.println("Konto mit Kontonummer " + kontonummer + " nicht gefunden."); 
     
 }

 // Methode zum Abrufen eines Kontos anhand der Kontonummer
 public Bankkonto getKonto(String kontonummer) {
     for (Bankkonto konto : konten) { // Durchläuft die ArrayList mit einer erweiterten for-Schleife
         if (konto.getKontonummer().equals(kontonummer)) { // Überprüft, ob die Kontonummer übereinstimmt
             return konto; // Gibt das gefundene Konto zurück
         }
     }
     return null; // Gibt null zurück, wenn kein Konto mit der angegebenen Kontonummer gefunden wurde
 }

 // Methode zum Anzeigen aller Konten in der Bank
 public void zeigeAlleKonten() {
     System.out.println("\nAlle Konten:"); // Gibt eine Überschrift aus
     for (Bankkonto konto : konten) { // Durchläuft die ArrayList mit einer erweiterten for-Schleife
         System.out.println(konto); // Gibt die Informationen des aktuellen Kontos aus (verwendet die toString()-Methode)
     }
 }
}
