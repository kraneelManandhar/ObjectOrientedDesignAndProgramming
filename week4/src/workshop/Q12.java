package workshop;

import java.util.Scanner;

public class Q12 {
	static String checkAge(int age) {
		if (age < 18) {
			return "You too young";
		}else {
		return "You just right";
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
		} finally {
			System.out.println("End of the program");
		}
	}
}