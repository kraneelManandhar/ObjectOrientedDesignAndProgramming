package tutorial;

public class CheckedException {
	public static void main(String[] args){
		try {
			verifyAge(17);
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void verifyAge(int age) throws VerifyAgeException{
		if (age<18) {
		throw new VerifyAgeException();
		}else {
		System.out.println("You can vote");
	}	
	}
}
