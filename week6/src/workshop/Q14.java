package workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Rectangle {
	double length, width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}
}

public class Q14 {
	@Test
	void testRectangle() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(15, r.area());
		assertEquals(16, r.perimeter());
	}
}