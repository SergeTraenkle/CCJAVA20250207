package thema12.oop10.datenstrukturen.banksystem.arraylist.tui2;

public class SparKonto extends Bankkonto {
    private double zinssatz;

    public SparKonto(String kontonummer, double kontostand, double zinssatz) {
        super(kontonummer, kontostand);
        this.zinssatz = zinssatz;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    @Override
    public String toString() {
        return super.toString() + ", Zinssatz: " + String.format("%.2f", zinssatz) + "%";
    }
}
