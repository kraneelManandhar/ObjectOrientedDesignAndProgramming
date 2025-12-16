package week2Workshop;

class Animalss {
	
	public Animalss() {
		System.out.println("Animal Created.");
	}
}

class Dogs extends Animalss{
	
	public Dogs() {
		super();
		System.out.println("Dog created");
	}
}

public class Qn5 {

	public static void main(String[] args) {
		Dogs dg = new Dogs();
	}

}
