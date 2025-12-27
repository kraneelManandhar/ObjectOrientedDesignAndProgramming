package workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//FactorialCalculator.java
class FactorialCalculator {
	public long factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException("No negative");
		if (n == 0)
			return 1;

		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}

public class Q13 {

	@Test
	void testFactorial() {
		FactorialCalculator fc = new FactorialCalculator();
		assertEquals(1, fc.factorial(0));
		assertEquals(1, fc.factorial(1));
		assertEquals(2, fc.factorial(2));
		assertEquals(6, fc.factorial(3));
		assertEquals(24, fc.factorial(4));
	}
}
