package thema12.oop5.interfaces;

//Katze-Klasse, erbt von Saeugetier
class Katze extends SauegeTier {
 @Override
 public void laufen() {
     System.out.println("Katze läuft.");
 }

 @Override
 public void fressen() {
     System.out.println("Katze frisst.");
 }
}
