package workshop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Convert {
	public double Coversion(double celcius) {
		return (celcius * 1.8) + 32;
	}
}

public class Qn2 {
	Convert c;

	@BeforeEach
	public void Before() {
		c = new Convert();
		System.out.println("Before the conversion.");
	}

	@Test
	public void convert() {
		Assertions.assertEquals(32, c.Coversion(0));
		Assertions.assertEquals(212, c.Coversion(100));
		Assertions.assertEquals(122, c.Coversion(50));
	}

	@AfterAll
	public static void after() {
		System.out.println("End of the conversion");
	}
}