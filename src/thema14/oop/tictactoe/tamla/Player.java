package thema14.oop.tictactoe.tamla;

public interface Player {
	Symbol getSymbol(); // Gibt das Symbol des Spielers zurück
	void makeMove(Board board); // Führt einen Spielzug aus
	boolean isHuman(); // Gibt an, ob der Spieler menschlich ist
	
}
