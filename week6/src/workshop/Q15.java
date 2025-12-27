package workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Shape {
	public double area() {
		return 0;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double r) {
		radius = r;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

class Rectangles extends Shape {
	double length, width;

	Rectangles(double l, double w) {
		length = l;
		width = w;
	}

	public double area() {
		return length * width;
	}
}

public class Q15 {
	@Test
	void testCircleArea() {
		Circle circle = new Circle(5);
		assertEquals(78.5, circle.area());
	}

	@Test
	void testRectangleArea() {
		Rectangles rectangle = new Rectangles(4, 6);
		assertEquals(24, rectangle.area());
	}

	@Test
	void testShapeArea() {
		Shape shape = new Shape();
		assertEquals(0, shape.area());
	}
}
