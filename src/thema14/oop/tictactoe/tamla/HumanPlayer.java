package thema14.oop.tictactoe.tamla;

public class HumanPlayer extends AbstractPlayer {
    public HumanPlayer(String name, Symbol symbol) { // Konstruktor
        super(symbol, name);
    }

    @Override
    public boolean isHuman() {
        return true;
    }

    @Override
    public void makeMove(Board board) {
        // Eingabe über Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bitte Zeile eingeben (0-2): ");
        int row = scanner.nextInt(); // Eingabe für Zeile

        System.out.println("Bitte Spalte eingeben (0-2): ");
        int col = scanner.nextInt(); // Eingabe für Spalte

        while (!board.makeMove(row, col, this.symbol)) { // solange das Feld nicht frei
            System.out.println("Ungültiger Zug. Bitte erneut versuchen.");
            row = scanner.nextInt(); // Weitere Eingabe für Zeile
            col = scanner.nextInt(); // Weitere Eingabe für Spalte
        }
    }
}
