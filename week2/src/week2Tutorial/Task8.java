package week2Tutorial;

// The final keyword doesn't let the child access
/*final*/ class Vehicle {
//	 The final keyword doesn't let the method be overwritten
	/*final */void start() {
		System.out.println("The vehicle starts");
	}
}

class Car extends Vehicle {
	void start() {
		super.start();
		System.out.println("Car has started");
	}
}

public class Task8 {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();

	}

}
