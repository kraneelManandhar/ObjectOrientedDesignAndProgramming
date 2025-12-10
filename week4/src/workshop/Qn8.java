package workshop;

public class Qn8 {
	public static void main(String[] args) {
		try {

			try {
				int a = 10 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: " + e.getMessage());
			}

			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println("Outer catch: " + e.getMessage());

		}
	}
}