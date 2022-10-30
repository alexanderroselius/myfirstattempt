package game;
import java.util.Scanner;

public class TakePinsGame {
	public static void main(String[] args) {
		Board b = new Board();
		//Scanner scan = new Scanner(System.in);
		b.setUp(UserInterface.askForInt("How many pins do you want to play with?"));
		HumanPlayer human = new HumanPlayer("You");
		ComputerPlayer bot = new ComputerPlayer("Bot");
		
		while (b.getNoPins() > 0) {
			int x = b.getNoPins();
			bot.takePins(b);
			UserInterface.printMessage("Bot took " + (x-b.getNoPins()) + " pins");
			UserInterface.printMessage("There are " + b.getNoPins() + " pins left");
			//System.out.println("Bot took " + (x-b.getNoPins()) + " pins");
			//System.out.println("There are " + b.getNoPins() + " pins left");
			if (b.getNoPins() == 0) {
				UserInterface.printMessage("Bot won the game");
				//System.out.println("Bot won the game");
			}
			human.takePins(b);
			//System.out.println(b.getNoPins() + " pins left");
			UserInterface.printMessage(b.getNoPins() + " pins left");
			if (b.getNoPins() == 0) {
				//System.out.println("You won the game");
				UserInterface.printMessage("You won the game");
			}
		}	
	}
}
