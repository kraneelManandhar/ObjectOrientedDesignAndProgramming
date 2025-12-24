package workshop;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//4.	Create a method getEvenNumbers(int[] numbers) in a NumberUtils class that filters out and returns only the even numbers from a given array of integers. 
//Write a JUnit test case to verify that the method correctly returns a list of even numbers.
//For example:
//Input: [1, 2, 3, 4, 5, 6]
//Expected Output: [2, 4, 6]

class NumberUtils {
	List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

	List<Integer> getEvenNumber(List<Integer> a) {

		List<Integer> even = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				even.add(a.get(i));
			}
		}
		return even;
	}
}

public class Qn4 {
	NumberUtils nu;

	@BeforeEach
	void Before() {
		nu = new NumberUtils();
	}
	
	@Test
	void getEvenNumbersTest() {
		List<Integer> expected = List.of(2,4,6,8);
		Assertions.assertEquals(expected , nu.getEvenNumber(nu.num));
	}

	@AfterEach
	public void after() {
		System.out.println("Code has succesfully completed.");
	}
}