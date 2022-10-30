package game;

import javax.swing.JOptionPane;

public class UserInterface {
	public static void printMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static int askForInt(String msg) {
		String a = JOptionPane.showInputDialog(msg);
		int nbrA = 0;
		try {
			nbrA = Integer.valueOf(a);
			if (nbrA < 0) {
				nbrA = -1;
			}
		} catch (NumberFormatException e) {
			nbrA = -1;
		}
		if (a == null) {
			nbrA = -2;
		}
		if (nbrA == -2) {
			System.exit(0);
		}
		return nbrA;
	}

}
