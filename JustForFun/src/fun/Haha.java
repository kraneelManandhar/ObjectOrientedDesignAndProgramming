package fun;

public class Haha {
	public static void main(String[] args) {
		
		
		
		try {
			System.out.println(7/0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of program");
	}
}
