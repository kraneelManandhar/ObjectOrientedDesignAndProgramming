package week2Tutorial;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person {
	int EmployeeId;

	public Employee(int EmployeeId, String name, int age) {
		super(name, age);
		this.EmployeeId = EmployeeId;
	}
}

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(111, "Kraneel", 19);
//		emp.name = "Manxe";
//		emp.age = 19;
//		emp.EmployeeId = 99;

		System.out.println("Name : " + emp.name + "\n Age : " + emp.age + "\n employee id : " + emp.EmployeeId);
	}
}
