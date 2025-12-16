package week2Workshop;

interface Swimable {
	void swim();
}

interface Flyables {
	void fly();
}

class Duck implements Swimable, Flyables {
	public void swim() {
		System.out.println("Duck can swim");
	}

	public void fly() {
		System.out.println("Duck can fly");
	}
}

public class Qn10 {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.fly();
		d.swim();
	}

}
