package thema11.oop5.staticdynamictypespolymorphism;

//Klasse Hund, erbt von Saeugetier
public class Hund extends Saeugetier {
 // Konstruktor (ruft den Konstruktor der Oberklasse auf)
 public Hund(String name) {
     super(name);
 }

 // Überschriebene Methode für Geräusche
 @Override
 public void macheGeraeusch() {
     System.out.println("Wuff!");
 }

 // Überschriebene Methode für Bewegung
 @Override
 public void bewegeDich() {
     System.out.println("Der Hund läuft.");
 }

 // Zusätzliche Methode für Hunde
 public void spiele() {
     System.out.println("Der Hund spielt mit einem Ball.");
 }
}
