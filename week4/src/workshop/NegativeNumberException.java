package workshop;

public class NegativeNumberException extends RuntimeException {
	
	public NegativeNumberException(){
		super("The number can't be negative.");
	}
}
	
