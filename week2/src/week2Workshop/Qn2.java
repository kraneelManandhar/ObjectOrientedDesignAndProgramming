package week2Workshop;

class Person{
	void displayInfo() {
		System.out.println("Info");
	}
}

class Employee extends Person{
	void displayRole() {
		System.out.println("Role");
	}
}

class Manager extends Employee{
	void displayDepartment() {
		System.out.println("Department");
	}
}

public class Qn2 {
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.displayDepartment();
		mg.displayInfo();
		mg.displayRole();
	}

}
