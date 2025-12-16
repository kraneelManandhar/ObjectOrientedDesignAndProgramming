package week2Workshop;

interface Runnable{
	void run();
}

class Carz implements Runnable{
	public void run() {
		System.out.println("Car is running.");
	}
}


public class Qn9v {

	public static void main(String[] args) {
		Carz c = new Carz();
		c.run();
	}

}
