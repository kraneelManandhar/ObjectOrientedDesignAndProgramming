package w5;

class Player {
	String name;

	public Player(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println(name + " is Playing.");
	}
}

class Team {
	private Player[] players;

	public Team() {
		players = new Player[] { new Player("Ronaldo"), new Player("Messi"), new Player("Neymar") };
	}

	public void show() {
		for (Player p : players) {
			p.play();
		}
	}

}

public class Qn9 {
	public static void main(String[] args) {
		Team p = new Team();
		p.show();

		p = null;

		try {
			p.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
