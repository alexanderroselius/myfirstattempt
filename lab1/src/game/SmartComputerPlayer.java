package game;

public class SmartComputerPlayer  extends Player{
	SmartComputerPlayer(String a){
		super(a);
	}
	
	public int takePins(Board board) {
		int a = board.getNoPins();
		int rest = a%3;
		if (rest == 2) {
			board.takePins(2);
		} else if (rest == 1) {
			board.takePins(1);
		} else {
			board.takePins(1);
		}
		return 0;
	}
}
