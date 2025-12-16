package week2Workshop;

interface A{
	default void show() {
		System.out.println("Show A");
	};
}

interface B{
	default void show() {
		System.out.println("Show B");
	}
}

class C implements A,B{
	public void show() {
		A.super.show();
		
		B.super.show();
	}
}

public class Q12 {
	public static void main(String[] args) {
		C c = new C();
		c.show();
	}
}
