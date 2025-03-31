package thema04.arrays4.tictactoe;

public class TicTacToe {

	public static void main(String[] args) {
		
		char[][] ttt = new char [3][3];
		
		// Initialsierung des Spielfeldes mit leeren Zeichen
		for(int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt.length; j++) {
				ttt [i][j] = ' '; 
			}			
		}
	}
}




