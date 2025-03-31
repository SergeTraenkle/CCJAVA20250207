package thema14.oop.tictactoe.tamla;

public abstract class AbstractPlayer implements Player {
	protected String name; // Name des Spielers
	protected Symbol symbol; // Symbol des Spielers
	
	// Konstruktor
	public AbstractPlayer(Symbol symbol, String name) {
		this.name = name;
		this.symbol = symbol;
	}
	
	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}
	
	public abstract boolean isHuman();


	
}
