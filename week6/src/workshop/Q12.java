package workshop;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeChecker {
	public boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Q12 {
	private PrimeChecker checker = new PrimeChecker();

	@Test
	void testSmallPrimes() {
		assertTrue(checker.isPrime(2));
		assertTrue(checker.isPrime(7));
		assertFalse(checker.isPrime(4));
		assertFalse(checker.isPrime(-5));
		assertFalse(checker.isPrime(20));
	}
}