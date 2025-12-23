package tutorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Convert{
	public double Coversion(double celcius) {
		return (celcius * 1.8 ) + 32;
	}
}

public class Task3 {
	static Convert c;
	@BeforeAll
	public static void Before() {
		c = new Convert();
	}
	
	@BeforeEach
	public void BeforeConversion() {
		System.out.println("The conversion of Celcius to Fahrenheit");
	}
	
	@Test
	public void Conversion() {
		Assertions.assertEquals(32,c.Coversion(0));
		Assertions.assertEquals(212,c.Coversion(100));
		Assertions.assertEquals(122,c.Coversion(50));
		
	}
	
	@AfterEach
	public void AfterConversion() {
		System.out.println(" Converted celcius to Fahrenheit");
	}
}

