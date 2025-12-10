package tutorial;

public class ErrorHandling {

	public static void main(String[] args) {
		int a = 20;
		int b = 2;
		System.out.println("First part of program");
		
		try {
			int arr[] = {2,3,5};
			System.out.println(arr[5]);
			int result = a/b;
			System.out.println("The result is: "+ result);
		}catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("Last part of program");
	}
}