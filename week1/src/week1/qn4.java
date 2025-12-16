package week1;

public class qn4 {
	public static void main(String[] args) {
		int a = 12;
		int b = 10;
		int c = 15;
		int s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The area of triangle is: "+ area);
	}
}
