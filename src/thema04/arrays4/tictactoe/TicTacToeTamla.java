package thema04.arrays4.tictactoe;
 
public class TicTacToeTamla {
	 
	public static void main(String[] args) {
 
		char[][] ttt = new char[3][3];
		
		// initialize the array
		for (int i = 0; i < ttt.length; i++) {			
			for (int j = 0; j < ttt[i].length; j++) {
				ttt[i][j] = ' ';
			}
		}
		
		// X: Mensch, O: Computer
		ttt[0][0] = 'X';
		ttt[0][1] = 'O';
		ttt[1][1] = 'X';
		ttt[2][2] = 'O';
		
		printTicTacToe(ttt);
		
	}
	
	private static void printTicTacToe(char[][] ttt) {
		for (int i = 0; i < ttt.length; i++) {			
			for (int j = 0; j < ttt[i].length; j++) {
				System.out.print(ttt[i][j]);
				if(j < ttt[i].length -1) {
					System.out.print(" | ");
				}
			}
			
			System.out.println();
		}
	}
}