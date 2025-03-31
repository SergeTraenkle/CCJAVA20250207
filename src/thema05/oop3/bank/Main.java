package thema05.oop3.bank;

public class Main {
    public static void main(String[] args) {
        // Bank erstellen
        Bank.setName("Sparkasse");
        
        // Kunden erstellen
        Kunde kunde1 = new Kunde("Max Mustermann", "Mustermannstraße 1");
        Kunde kunde2 = new Kunde("Anna Meier", "Meierweg 2");
        
        // Bankkonten erstellen
        Bankkonto konto1 = new Bankkonto("123456", 1000.00, kunde1);
        Bankkonto konto2 = new Bankkonto("654321", 2000.00, kunde2);
        
        // Bankinfo ausgeben
        Bank.printBankInfo();
        
        // Kundeninformationen ausgeben
        System.out.println("Kundeninformationen:");
        System.out.println(kunde1);
        System.out.println(kunde2);
        System.out.println();
        
        // Kontoinformationen ausgeben
        System.out.println("Kontoinformationen:");
        System.out.println(konto1);
        System.out.println(konto2);
        System.out.println();
        
        // Aktien erstellen
        Aktie apple = new Aktie("AAPL123", "Apple Inc.", 145.00);
        Aktie microsoft = new Aktie("MSFT456", "Microsoft Corp.", 270.00);
        
        // Preise aktualisieren
        apple.aktualisierePreis(150.00);
        microsoft.aktualisierePreis(280.00);
        
        // Ausgabe
        System.out.println("Aktieninformationen:");
        System.out.println(apple);
        System.out.println(microsoft);
        
        // Darlehensvertrag

        Darlehensvertrag vertrag = new Darlehensvertrag("D001", kunde1, 10000.0, 5.0, 12);
        System.out.println(vertrag);
    }
}
