package week2Tutorial;

class Grandparent {

	public String displayGrant() {
		return "I am Grandparent";
	}
}

class Parent extends Grandparent {
	public String displayParent() {
		return "I am parent";
	}

}

class Child extends Parent {
	public String displayChild() {
		return "I am child";
	}

	public void DisplayAll() {
		System.out.println(displayChild() + "\n" + displayGrant() + "\n" + displayParent());
	}
}

public class Task4 {

	public static void main(String[] args) {

		Child cld = new Child();

		cld.DisplayAll();
	}

}
