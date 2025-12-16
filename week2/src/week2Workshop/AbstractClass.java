package week2Workshop;

abstract class Vehicle {
	
	String color = "Red";  //public static final
	abstract void topSpeed();

	abstract void fuelEfficiency();  //public abstract

	void showSpeed() {
	}
}

class Car extends Vehicle {
	@Override
	void topSpeed() {
		System.out.println("The top speed of car.");
	}

	@Override
	void fuelEfficiency() {
		System.out.println("The fuel efficiency of car.");
	}
}

class Bike extends Vehicle {
	@Override
	void topSpeed() {
		System.out.println("The top speed of bike.");
	}

	@Override
	void fuelEfficiency() {
		System.out.println("The fuel efficiency of bike.");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		
		c.topSpeed();
		c.fuelEfficiency();
		
		b.topSpeed();
		b.fuelEfficiency();
	}
}
