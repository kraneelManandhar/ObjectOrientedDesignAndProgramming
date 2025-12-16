package week2Tutorial;

abstract class Employe {
	final int SalaryPart = 1000;
	final int SalaryFull = 500;

	abstract void calculateSalary();

	void getDetails() {
		System.out.println("Get details of the employee");
	}
}

class FullTimeEmployee extends Employe {
	void calculateSalary() {

	}
}

class PartTimeEmployee extends Employe {
	void calculateSalary() {

	}
}

public class Task9 {

	public static void main(String[] args) {

	}

}
