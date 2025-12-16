package tutorial;

class AreaCalculator{
	
	public void area(int length,int height) {
		System.out.println("Area = "+(length * height));
	}
	
	public void area(int length) {
		System.out.println("Area = " + length*length);
	}
	
	public void area(double radius) {
		System.out.println("Area = "+ Math.PI*radius*radius);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		AreaCalculator ac = new AreaCalculator();
		
		ac.area(2);
		ac.area(4);
		ac.area(123.34);
	}
}
