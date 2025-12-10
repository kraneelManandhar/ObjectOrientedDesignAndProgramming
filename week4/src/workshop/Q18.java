package workshop;

import java.util.Scanner;

class AgeException extends Exception {
	public AgeException(String st) {
		super(st);
	}
}

public class Q18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new AgeException("You're under 18");
			}
			System.out.println("Your age is " + age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
