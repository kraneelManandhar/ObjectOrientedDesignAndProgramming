package week2Workshop;

interface Shape {
	void calculateArea();

	void calculatePerimeter();
}

class Circle implements Shape {
	@Override
	public void calculateArea() {
		System.out.println("Area = Math.pi*Math.pow(r,2)");
	}

	public void calculatePerimeter() {
		System.out.println("Perimeter = 2*Math.pi*r");
	}

}

class Rectangle implements Shape {
	@Override
	public void calculateArea() {
		System.out.println("Area = Length * breadth");
	}

	public void calculatePerimeter() {
		System.out.println("Perimeter = 2( length + breadth)");
	}

}

public class Interface {
	public static void main(String[] args) {
		Circle c = new Circle();

		Rectangle r = new Rectangle();

		c.calculateArea();
		c.calculatePerimeter();

		r.calculateArea();
		r.calculatePerimeter();
	}
}
