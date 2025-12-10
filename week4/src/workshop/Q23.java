package workshop;

public class Q23 {
	
	public static class NegativeNumberException extends RuntimeException {
		
		public NegativeNumberException(){
			super("The number can't be negative.");
		}
	}
		
	public static class BigNumberException extends RuntimeException {
		
		public BigNumberException(){
			super("The number is too big.");
		}
	}
		
	public static void main(String[] args) {
		int a = 100;
		try {
			if (a<0) {
				throw new NegativeNumberException();
			}
			
			if (a>3) {
				throw new BigNumberException();
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
