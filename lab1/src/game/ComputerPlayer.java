package game;

public class ComputerPlayer extends Player {
	ComputerPlayer(String a){
		super(a);
	}	
	int takePins(Board board){
		int  a = (int)(1 +  Math.floor(Math.random() * 2));
		if (board.getNoPins() - a >= 0) {
			board.takePins(a);
		} else {
			a = board.getNoPins();
			board.takePins(a);
		}
		return a;
	}
}
