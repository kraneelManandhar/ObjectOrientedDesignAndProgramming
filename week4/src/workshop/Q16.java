package workshop;

public class Q16 {

	static void method1() throws Exception {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught in method1: " + e.getMessage());
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}