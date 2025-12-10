package workshop;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("You entered: " + num);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
				sc.close();
				System.out.println("Scanner closed in finally block.");
		}
	}
}