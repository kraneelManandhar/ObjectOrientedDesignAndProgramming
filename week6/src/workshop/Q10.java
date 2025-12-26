package workshop;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//10.	 You are developing a basic calculator application with operations like addition, subtraction, multiplication, and division. Each test case checks a specific operation.
//Tasks:
//Write a JUnit test using annotations that:
//●	Before each test, initializes a Calculator object.
//●	After each test, resets any necessary states or prints a message.
//●	BeforeClass: Set up any global configuration (if needed).
//●	AfterClass: Perform any clean-up after all tests are completed (e.g., release resources if any).

class Calculators{
	 public int add(int a, int b) {
	        return a + b;
	    }
	    
	    public int subtract(int a, int b) {
	        return a - b;
	    }
	    
	    public int multiply(int a, int b) {
	        return a * b;
	    }
	    
	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }
}

public class Q10 {
	
	Calculators calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculators();
	}
	
	
	 @Test
	    void testAllMethods() {
	        assertAll(
	            () -> assertEquals(5, calc.add(2, 3)),
	            () -> assertEquals(1, calc.subtract(4, 3)),
	            () -> assertEquals(6, calc.multiply(2, 3)),
	            () -> assertEquals(2, calc.divide(6, 3))
	        );
	    }
}