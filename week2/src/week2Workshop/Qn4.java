package week2Workshop;

interface Flyable {

	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird flies");
	}

	public void eat() {
		System.out.println("Bird eats");
	}
}

class Eagle extends Bird implements Flyable {

}

public class Qn4 {
	public static void main(String[] args) {
		Eagle eg = new Eagle();
		eg.fly();
		eg.eat();
	}
}
