package thema05.oop3.bank;

public class Bank {
    private static String name;
    private static int anzahlKonten = 0;
    
    public static void setName(String bankName) {
        name = bankName;
    }
    
    public static void erhoeheAnzahlKonten() {
        anzahlKonten++;
    }
    
    public static void printBankInfo() {
        System.out.println("Bank: " + name);
        System.out.println("Anzahl Konten: " + anzahlKonten);
        System.out.println();
    }
}
