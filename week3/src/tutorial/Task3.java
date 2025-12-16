package tutorial;

class Competitor {
	void getOverallScore() {
		System.out.println("Competitor score");
	}
}

class Shooter extends Competitor {
	void getOverallScore() {
		super.getOverallScore();
		System.out.println("Shooters score");
	}

	void displayGunType() {
		System.out.println("Gun Type");
	}
}

public class Task3 {

	public static void main(String[] args) {

		Competitor c = new Shooter();
		c.getOverallScore();

		if (c instanceof Shooter) {
			c.getOverallScore();
			((Shooter) c).displayGunType();
		} else {
			System.out.println("Error while creating instance");
		}
	}
}