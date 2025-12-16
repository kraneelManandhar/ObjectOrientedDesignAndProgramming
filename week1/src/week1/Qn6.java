package week1;
import java.util.*;

public class Qn6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celcius: ");
		double C = sc.nextDouble();
		double F = C * 9/5 + 32;
		
		System.out.println("The conversion of "+ C + " Celcius to Fahrenheit is "+ F);

	}

}
