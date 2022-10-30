package game;

public abstract class Player {
	String userId;

	public Player(String a) {
		userId = a;
	}

	String getUserId() {
		return userId;
	}
	public abstract int takePins(Board b);

}