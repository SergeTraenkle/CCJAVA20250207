package thema05.oop3.bank;

public class Kunde {
    private String name;
    private String adresse;
    
    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }
    
    public String getName() {
        return name;
    }
/*    
    @Override
    public String toString() {
        return "Kunde: " + name + ", Adresse: " + adresse;
    }
*/    
    @Override
    public String toString() {
        return String.format("Kunde: %-14s, Adresse: %-20s",
        	name,
        	adresse);
    }

}

