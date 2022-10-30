package game;

public class HumanPlayer extends Player {
	HumanPlayer(String b) {
		super(b);
	}

	public int takePins(Board board) {

//Scanner scan = new Scanner(System.in);
		int a = UserInterface.askForInt("How many pins do you want to take?");
		while (a != 1 && a != 2) {
//System.out.println("Enter 1 or 2");
			UserInterface.printMessage("Enter 1 or 2");
			a = UserInterface.askForInt("How many pins do you want to take?");
		}
		board.takePins(a);
		return a;
	}
}