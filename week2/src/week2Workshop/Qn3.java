package week2Workshop;

class Animal {
	void Sound() {
		
	}
}

class Dog extends Animal{
	void Sound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal{
	void Sound() {
		System.out.println("Meow");
	}
}
public class Qn3 {
	public static void main(String[] args) {
		Dog dg = new Dog();
		Cat ct = new Cat();
		
		dg.Sound();
		ct.Sound();
	}
}
