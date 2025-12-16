package week1;
import java.util.Scanner;
public class Qn5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the square: ");
		int length  = sc.nextInt();
		
		double area = Math.pow(length,2);
		
		System.out.println("The area of the square with length "+length+ " is "+ area);
		
	}

}
