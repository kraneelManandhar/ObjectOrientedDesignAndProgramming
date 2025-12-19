package w5;

class Engine {
	void start() {
		System.out.println("Engine is working");
	}
}

class Car {
	private Engine engine;

	Car(Engine engine) {
		this.engine = engine;
	}
}

public class Qn12 {
	public static void main(String[] args) {

		Engine eng = new Engine();

		Car car = new Car(eng);

		car = null;

		eng.start();
	}
}
