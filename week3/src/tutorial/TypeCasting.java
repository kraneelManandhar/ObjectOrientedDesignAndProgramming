package tutorial;

class Animal {
	public void makeSound() {
		System.out.println("Animal make sound.......");
	}
	
	public void eat() {
		System.out.println("Animal eats food.");
	}
}

class Dog extends Animal(){

	public void makeSound() {
		System.out.println("Dog barks");
	}

	public void fetch() {
		System.out.println("Dog fetchs a ball");
	}
}

public class TypeCasting {
	public static void main(String[] args) {
//		double a = 5.5;
//		int i = (int) a;
//		System.out.println(i);
//
//		int n = 5;
//		double x = n;
		
		
		Animal a = new Dog();  //Upcasting and is Implicit
		a.makeSound();
//		a.fetch();
		a.eat();
		
	}
	
	

}
