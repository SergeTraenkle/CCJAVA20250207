package thema12.oop5.interfaces;

//Hund-Klasse, erbt von Saeugetier und implementiert Zeichnen
class Hund extends SauegeTier implements Zeichnen {
 @Override
 public void laufen() {
     System.out.println("Hund läuft.");
 }

 @Override
 public void fressen() {
     System.out.println("Hund frisst.");
 }

 @Override
 public void zeichneRechteck() {
     System.out.println("Hund zeichnet Rechteck");
 }

 @Override
 public void zeichneKreis() {
     System.out.println("Hund zeichnet Kreis");
 }

 @Override
 public void zeichneDreieck() {
     System.out.println("Hund zeichnet Dreieck");
 }
}
