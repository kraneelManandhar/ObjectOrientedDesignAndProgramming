package workshop;

public class Qn2 {
	public static void main(String[] args) {
		try {
            System.out.println(7 / 0);  // Arithmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
	}
}
