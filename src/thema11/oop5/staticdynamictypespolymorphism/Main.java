package thema11.oop5.staticdynamictypespolymorphism;

public class Main {
    public static void main(String[] args) {
        // Instanziierung von Objekten mit dem statischen Typ Saeugetier
        // Upcasting: Hund -> Saeugetier (implizit = stillschweigend eingeschlossen)
        Saeugetier hund = new Hund("Bello");
        // Upcasting: Katze -> Saeugetier (implizit)
        Saeugetier katze = new Katze("Minka");

        // Speichern der Objekte in einem Array vom Typ Saeugetier
        Saeugetier[] tiere = {hund, katze};

        
        // Iteration über das Array
        for (Saeugetier tier : tiere) { /*for*/
            System.out.println("Name: " + tier.getName());
            // Polymorphie:  Die korrekte Methode (macheGeraeusch, bewegeDich)
            // wird basierend auf dem dynamischen Typ des Objekts aufgerufen.
            tier.macheGeraeusch();
            tier.bewegeDich();

            // Verwendung von instanceof zur Überprüfung des dynamischen Typs
            if (tier instanceof Hund) { // tier Instanz von Hund
                // Downcasting: von Saeugetier -> zu Hund: expliziete Typumwandlung
            											 //(explizit = ausdrücklich)
                ((Hund) tier).spiele();
                
            } else if (tier instanceof Katze) { // tier Instanz von Katze
                // Downcasting: von Saeugetier -> zu Katze (explizit = ausdrücklich)
                ((Katze) tier).spiele();
            }
        } /*for*/

    }
}
