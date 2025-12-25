package workshop;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringManipulator {
	public String reverse(String s) {
		if (s == null)
			return null;
		return new StringBuilder(s).reverse().toString();
	}

	public String toUpperCase(String s) {
		if (s == null)
			return null;
		return s.toUpperCase();
	}

	public boolean isPalindrome(String s) {
		if (s == null)
			return false;
		return s.equalsIgnoreCase(reverse(s));
	}

	public int countVowels(String s) {
		if (s == null)
			return 0;
		return s.toLowerCase().replaceAll("[^aeiou]", "").length();
	}
}

public class Qn9 {
	@Test
	void testAllMethods() {

		StringManipulator sm = new StringManipulator();

		assertAll(() -> assertEquals("olleh", sm.reverse("hello")),
				() -> assertEquals("HELLO", sm.toUpperCase("hello")),
				() -> assertTrue(sm.isPalindrome("madam")),
				() -> assertEquals(2, sm.countVowels("hello")));
	}
}
