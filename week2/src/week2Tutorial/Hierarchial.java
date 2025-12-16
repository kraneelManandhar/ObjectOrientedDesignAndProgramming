package week2Tutorial;

class Animal {
	String name, color;
	int age;
	float weight;

	public Animal(String name, String color, int age, float weight) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

}

class Dog extends Animal {
	boolean isIndoor;
	String breed;

	public Dog(String name, String color, int age, float weight, boolean isIndoor, String breed) {
		super(name, color, age, weight);
		this.breed = breed;
		this.isIndoor = isIndoor;
	}
}

class Cat extends Animal {
	float height;

	public Cat(String name, String color, int age, float weight, float height) {
		super(name, color, age, weight);
		this.height = height;
	}
}

public class Hierarchial {

	public static void main(String[] args) {

		Dog dg = new Dog("Kukur", "Black", 10, 12f, true, "Kukur_ko_breed");
		Cat ct = new Cat("Biralo", "Black", 11, 10f, 7f);

		System.out.println(dg.age);
		System.out.println(dg.breed);
		System.out.println(dg.color);
		System.out.println(dg.name);
		System.out.println(dg.isIndoor);
		System.out.println(ct.name);
		System.out.println(ct.weight);

	}

}
