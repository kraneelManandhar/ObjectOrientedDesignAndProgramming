package week1;
import java.util.*;

public class Qn7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount: ");
		int P = sc.nextInt();
		
		System.out.println("Enter time for the loan :");
		float T = sc.nextFloat();
		
		System.out.println("Enter the rate : ");
		float R = sc.nextFloat();
		
		float si = (P*T*R)/100;
		
		System.out.println("The Simple Intrest is : "+ si);
		

	}

}
