package workshop;

class MyCheckedException extends Exception {
	public MyCheckedException(String msg) {
		super(msg);
	}
}

public class Q17 {
	static void checkNumber(int num) throws MyCheckedException {
		if (num < 0) {
			throw new MyCheckedException("Checked Exception: Number cannot be negative");
		}
	}

	public static void main(String[] args) {
		try {
			checkNumber(-5);
		} catch (MyCheckedException e) {
			System.out.println(e.getMessage());
		}

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Unchecked Exception: " + e.getMessage());
		}
	}
}
