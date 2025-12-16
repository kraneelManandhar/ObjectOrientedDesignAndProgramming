package week1;

public class Q13 {
	/**
	 * Adds two numbers given in by the programmer
	 * @param num1 The first number with data type int
	 * @param num2The second number also with data type int
	 * @return
	 */
	public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
	
/**
 * This function calls the method for adding two numbers
 * @param args
 */
	public static void main(String[] args) {
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
	}
}