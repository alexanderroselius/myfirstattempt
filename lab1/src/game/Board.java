package game;

public class Board {
	int noPins;

	void setUp(int a) {
		noPins = a;
	}

	void takePins(int a) {
		noPins = noPins - a;
	}

	int getNoPins() {
		return noPins;
	}

}