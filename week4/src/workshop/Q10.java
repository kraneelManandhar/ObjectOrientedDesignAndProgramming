package workshop;

import java.util.Scanner;

public class Q10 {
	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("You too young");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("End of the program");
		}
	}
}
