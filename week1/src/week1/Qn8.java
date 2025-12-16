package week1;
import java.util.*;
public class Qn8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = sc.nextDouble();
		
		double add = num1 + num2;
		double sub = num1 - num2;
		double multiply = num1 * num2;
		double divide = num1/num2;
		
		System.out.println("The addition between "+ num1 + " and "+ num2 +" is: "+ add + "\n" + "The subtraction between "+ num1 + " and "+ num2 +" is: "+ sub);
		System.out.println("The Multiplication between "+ num1 + " and "+ num2 +" is: "+ multiply + "\n" + "The Division between "+ num1 + " and "+ num2 +" is: "+ divide);
	}

}
