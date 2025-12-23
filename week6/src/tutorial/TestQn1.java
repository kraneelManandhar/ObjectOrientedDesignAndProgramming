package tutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQn1 {

	Qn1 c;

	@BeforeAll
	public static void setupAll() {
		System.out.println("Run once before code.");
	}
	
	@BeforeEach
	public void setup() {
		c = new Qn1();
		System.out.println("Before the test");
	}

	@Test
	public void addTest() {
		Assertions.assertEquals(4, c.add(2, 2));
		Assertions.assertEquals(1, c.add(1, 0));
		Assertions.assertEquals(10, c.add(8, 2));
		System.out.println("Add test");
	}

	@Test
	public void substractTest() {
		Assertions.assertEquals(4, c.sub(5, 1));
		Assertions.assertEquals(1, c.sub(1, 0));
		Assertions.assertEquals(6, c.sub(8, 2));
		System.out.println("Subtract test");
	}

	@Test
	public void multiplyTest() {
		Assertions.assertEquals(4, c.mult(2, 2));
		Assertions.assertEquals(0, c.mult(1, 0));
		Assertions.assertEquals(16, c.mult(8, 2));
		System.out.println("Multiply test");
	}

	@Test
	public void divideTest() {
		Assertions.assertEquals(1, c.div(2, 2));
		Assertions.assertEquals(10, c.div(10, 1));
		Assertions.assertEquals(4, c.div(8, 2));
		System.out.println("Divide test");
	}
	
	@AfterEach
	public void cleanUp() {
		c = null;
		System.out.println("After the test ");
	}
	
	@AfterAll
	public static void cleanupAll() {
		System.out.println("Run once after all");
	}
}