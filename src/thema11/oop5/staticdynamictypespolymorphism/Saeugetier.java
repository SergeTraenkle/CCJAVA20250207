package thema11.oop5.staticdynamictypespolymorphism;

//Abstrakte Klasse Saeugetier
public abstract class Saeugetier {
 private String name; // Attribut: Name des Tieres

 // Konstruktor
 public Saeugetier(String name) {
     this.name = name;
 }

 // Methode zum Abrufen des Namens
 public String getName() {
     return name;
 }

 // Abstrakte Methode für die Bewegung (muss in Unterklassen implementiert werden)
 public abstract void bewegeDich();

 // Abstrakte Methode für Geräusche (muss in Unterklassen implementiert werden)
 public abstract void macheGeraeusch();
}
