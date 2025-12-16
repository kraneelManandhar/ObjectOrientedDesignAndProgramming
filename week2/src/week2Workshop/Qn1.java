package week2Workshop;

 class Vehicles {
	void start() {
		
	}
}

class Cars extends Vehicles {
	@Override
	void start() {
		System.out.println("Car Started");
	}
}

public class Qn1 {
	public static void main(String[] args) {
		Cars c = new Cars();
		c.start();
	}
}