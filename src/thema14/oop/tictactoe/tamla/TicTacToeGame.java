package thema14.oop.tictactoe.tamla;

public class TicTacToeGame {
	 
	private Board board;
	
	private Player player1;
	
	private Player player2;
	
	public TicTacToeGame() {
		board = new Board();
		player1 = new HumanPlayer("Spieler", GameConfig.SYMBOLS.get("PLAYER"));
		player2 = new ComputerPlayer("Computer", GameConfig.SYMBOLS.get("COMPUTER"));
	}
	
	public void play() {
		Player currentPlayer = player1;
		while(!board.isFull()) {
			board.printBoard();
			currentPlayer.makeMove(board);
			if(board.checkWin(currentPlayer.getSymbol())) {
				board.printBoard();
				System.out.println(currentPlayer.getSymbol() + " gewinnt!");
				return;
			}
			
			
//			if(currentPlayer == player1) {
//				currentPlayer = player2;
//			} else {
//				currentPlayer = player1;
//			}
			currentPlayer = (currentPlayer == player1) ? player2 : player1;
		}
		
		board.printBoard();
		System.out.println("Unentschieden");
	}
}
 