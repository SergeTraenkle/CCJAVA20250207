package thema14.oop.tictactoe.tamla;

import java.util.HashMap;
import java.util.Map;
 
public interface GameConfig {
	int BOARD_SIZE = 3;
	
	Map<String, Symbol> SYMBOLS = new HashMap<String, Symbol>(){{
		put("PLAYER", Symbol.X);
		put("COMPUTER", Symbol.O);
	}};
}