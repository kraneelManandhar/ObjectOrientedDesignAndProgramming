package w5;

interface Swimm{
	void swim();
}

interface Quackk{
	void quack();
}

 class Duck implements Swimm,Quackk{
	   public void swim() {
	      System.out.println("Swimming");
	   }
	   public void quack() {
	      System.out.println("Quacking");
	   }
	}

	 class WoodenDuck implements Swimm {
		 public void swim() {
			 System.out.println("Wooden duck swims");
		 }
	}

 class Qn7 {
	 public static void main(String[] args) {
		
	}
}
