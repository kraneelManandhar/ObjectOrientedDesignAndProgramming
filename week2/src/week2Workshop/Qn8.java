package week2Workshop;

abstract class Appliance{
	void turnOn() {
		System.out.println("The Applience is turned on");
	}
	
	abstract void operate();
}

class WashingMachine extends Appliance{
	void operate() {
		System.out.println("Washing Machhine is Operated.");
	}
}

public class Qn8 {
	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine();
		wm.operate();
		wm.turnOn();
	}
}
