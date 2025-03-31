package thema11.oop5.staticdynamictypespolymorphism;

//Klasse Katze, erbt von Saeugetier
public class Katze extends Saeugetier {
 // Konstruktor (ruft den Konstruktor der Oberklasse auf)
 public Katze(String name) {
     super(name);
 }

 // Überschriebene Methode für Geräusche
 @Override
 public void macheGeraeusch() {
     System.out.println("Miau!");
 }

 // Überschriebene Methode für Bewegung
 @Override
 public void bewegeDich() {
     System.out.println("Die Katze schleicht.");
 }

 // Zusätzliche Methode für Katzen
 public void spiele() {
     System.out.println("Die Katze spielt mit einem Wollknäuel.");
 }
}
