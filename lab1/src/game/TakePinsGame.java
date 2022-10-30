package game;

public class TakePinsGame {
	public static void main(String[] args) {
		Board b = new Board();
		b.setUp(UserInterface.askForInt("How many pins do you want to play with?"));
		HumanPlayer human = new HumanPlayer("You");
		SmartComputerPlayer bot = new SmartComputerPlayer("Bot");

		while (b.getNoPins() > 0) {
			int x = b.getNoPins();
			bot.takePins(b);
			UserInterface.printMessage("Bot took " + (x - b.getNoPins()) + " pins");
			UserInterface.printMessage("There are " + b.getNoPins() + " pins left");
			if (b.getNoPins() == 0) {
				UserInterface.printMessage("Bot won the game");
				System.exit(0);
			}
			human.takePins(b);
			UserInterface.printMessage(b.getNoPins() + " pins left");
			if (b.getNoPins() == 0) {
				UserInterface.printMessage("You won the game");
			}
		}
	}
}