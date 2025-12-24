package workshop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//1.	Write a simple method in a Calculator class that adds two integers. Then, create a JUnit test case to verify that the method works correctly by adding two numbers together

class Calculator{
	public int add(int a ,int b) {
		return a+b;
	}
}

public class Qn1 {
	static Calculator c;
	@BeforeAll
	public static void beforeAll(){
		c  = new Calculator();
		System.out.println("Run before everything.");
	}
	@Test
	public void add() {
		try {
			Assertions.assertEquals(4,	c.add(2, 2));
			Assertions.assertEquals(9,	c.add(3, 6));
			Assertions.assertEquals(0,	c.add(0, 0));
			Assertions.assertEquals(10,c.add(1, 9));
		System.out.println("True");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@AfterAll
	public static void end() {
		System.out.println("Test completed");
	}
}
