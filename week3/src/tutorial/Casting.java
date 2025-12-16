package tutorial;

class Animals {
	public void makeSound() {
		System.out.println("Animal make sound.......");
	}

	public void eat() {
		System.out.println("Animal eats food.");
	}
}

class Dogs extends Animals {

	public void makeSound() {
		System.out.println("Dog barks");
	}

	public void fetch() {
		System.out.println("Dog fetchs a ball");
	}
}

public class Casting {

	public static void main(String[] args) {
//		double a = 5.5;
//		int i = (int) a;
//		System.out.println(i);
//
//		int n = 5;
//		double x = n;

		Animals a = new Dogs(); // Upcasting and is Implicit
		a.makeSound();
//		a.fetch();
		a.eat();

		Dogs d = (Dogs) a; // Downcasting Explicit
		d.fetch();

		if (a instanceof Dogs) {
			Dogs d1 = (Dogs) a;
			d1.fetch();
		} else {
			System.out.println("Not a instancct of dog.");
		}
	}
}