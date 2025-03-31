package thema14.oop.tictactoe.tamla;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {
 
	private Random random = new Random();
	
	public ComputerPlayer(String name, Symbol symbol) {
		super(name, symbol);
	}
 
	@Override
	public boolean isHuman() {
		return false;
	}
 
	@Override
	public void makeMove(Board board) {
		int row, col;
		do {
			row = random.nextInt(GameConfig.BOARD_SIZE);
			col = random.nextInt(GameConfig.BOARD_SIZE);
		} while(!board.makeMove(row, col, symbol));
		
		System.out.println(name + " platziert " + symbol + " auf(" + row + ", " + col + ")");
	}
}
 
 