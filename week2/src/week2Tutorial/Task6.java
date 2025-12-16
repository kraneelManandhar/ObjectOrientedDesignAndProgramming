package week2Tutorial;

import java.util.*;

class Shape {
	String color;

	void printArea() {
		System.out.println("This is the area of the shape.");
	}
}

class Rectangle extends Shape {

	public String printArea(double length, double width) {
		double Area = length * width;
		return "The area of rectangle is : " + Area;
	}
}

class Square extends Shape {
	double length;

	String printArea(double length) {

		double Area = Math.pow(length, 2);
		return "The area of square is : " + Area;
	}
}

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width : ");
		double width = sc.nextDouble();
		System.out.println("Enter length : ");
		double length = sc.nextDouble();
		sc.close();

		Rectangle rec = new Rectangle();
		System.out.println(rec.printArea(length, width));

		Square sq = new Square();
		sq.printArea(length);

		System.out.println(sq.printArea(length));
		

	}

}
