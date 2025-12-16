package week1;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();

		System.out.println("Enter the price: ");
		float price = sc.nextFloat();
		
		double cost = quantity * price;
		
		System.out.println("The total cost for all the items is : "+ cost);
		
	}

}
