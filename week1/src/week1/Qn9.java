package week1;
import java.util.*;

public class Qn9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		float rad = sc.nextFloat();
		
		double area = Math.PI * Math.pow(rad, 2);
		
		System.out.println("The area of the circle with radius " + rad + " is "+ area);
	}

}
