package week2Workshop;

abstract class Shapes {
	abstract void area();
}

class Circles extends Shapes {
	public void area() {
		System.out.println("Area of Circle.");
	}
}

class Rectangles extends Shapes {
	public void area() {
		System.out.println("Area of Rectangle.");
	}
}

public class Qn7 {
	public static void main(String[] args) {
		Circles c = new Circles();
		Rectangles r = new Rectangles();
		c.area();
		r.area();
	}
}
