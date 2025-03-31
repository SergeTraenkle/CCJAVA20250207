package thema12.oop5.interfaces;

//Hauptprogramm
public class MainProgram {
 public static void main(String[] args) {
     Hund maxHund = new Hund();
     Katze lottiKatze = new Katze();
     Person xPerson = new Person();

     // SauegeTier: abstrakte Superklasse (oder Oberklasse)
     SauegeTier[] sauegeTiere = {maxHund, lottiKatze, xPerson};

     // Iterieren und ausgeben (Säugetiere)
     System.out.println("--- Säugetiere ---");
     for (SauegeTier tier : sauegeTiere) {
         tier.laufen();
         tier.fressen();
     }

     // Zeichnen: Gemeinsames Interface für Hund und Person
     Zeichnen[] zeichnenObjekte = {maxHund, xPerson};

     // Iterieren und ausgeben (Zeichnen-Objekte)
     System.out.println("\n--- Zeichnende Objekte ---");
     for (Zeichnen objekt : zeichnenObjekte) {
         objekt.zeichneRechteck();
         objekt.zeichneKreis();
         objekt.zeichneDreieck();
     }
 }
}