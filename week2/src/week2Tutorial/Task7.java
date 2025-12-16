package week2Tutorial;

class Animals {
	String name;
	double weight;

	public void makeSound() {
		System.out.println("Animals makes sound");
	}

	public Animals(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
}

class Cats extends Animals {
	String breed;

	public Cats(String breed, String name, double weight) {
		super(name, weight);
		this.breed = breed;
	}

	public void makeSound() {
		super.makeSound();
		System.out.println("Cats make noise");
	}

}

public class Task7 {
	public static void main(String[] args) {
		Cats c = new Cats("breed_of_cat", "Biralo", 17.20);

		System.out.println("Name: " + c.name);
		System.out.println("Weight: " + c.weight);
		System.out.println("Breed: " + c.breed);
		c.makeSound();

	}
}
