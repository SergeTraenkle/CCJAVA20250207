package thema14.oop.tictactoe.tamla;

public class Board {
	 
	private Symbol[][] board;		// 2D-Array für Spielfeld
	
	public Board() {
		board = new Symbol[GameConfig.BOARD_SIZE][GameConfig.BOARD_SIZE];
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				board[i][j] = Symbol.LEER;
			}
		}
	}
	
	public boolean makeMove(int row, int col, Symbol symbol) {
		if(row < 0 || row >= GameConfig.BOARD_SIZE || col < 0 || col >= GameConfig.BOARD_SIZE) {
			return false;
		}
		
		if(board[row][col] == Symbol.LEER) {
			board[row][col] =  symbol;
			return true;
		}
		
		return false;
	}
	
	public void printBoard() {
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				String ausgabe = board[i][j] == Symbol.LEER ? " - " : board[i][j] + " ";
				System.out.print(ausgabe);
			}
			System.out.println();
		}
	}
	
	public boolean isFull() {
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				if(board[i][j] == Symbol.LEER) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean checkWin(Symbol symbol) {
 
		// Prüfe Reihen und Spalten
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			if((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) || // Horizontale Prüfung
				(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) { // Vertikale Prüfung
				return true;
			}
		}
		
		// Diagonale Prüfung
		if((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
			(board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
			return true;
		}
	
		return false;
	}
}
 
 