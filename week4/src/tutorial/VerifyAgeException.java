package tutorial;

public class VerifyAgeException extends RuntimeException{
	
	public VerifyAgeException() {
		super("You cannot vote.");
	}
}