package workshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//3.	Write a class BankAccount with methods deposit(double amount) and withdraw(double amount). The account balance should start at 0.0, and the methods should update the balance accordingly. 
//Write a JUnit test that:
//●	Ensures a deposit of 100.0 increases the balance to 100.0.
//●	Ensures a withdrawal of 50.0 decreases the balance to 50.0.
//●	Verifies that a withdrawal of 60.0 fails (balance should remain 50.0)

class BankAccount {
	double Account;

	double deposit(double amount) {
		Account += amount;
		System.out.println(amount + " deposited in your account ");
		System.out.println("Final amount : " + Account);
		return Account;
	}

	double withdraw(double amount) {
		Account -= amount;
		System.out.println(amount + " winthdraw in your account ");
		System.out.println("Final amount : " + Account);
		return Account;
	}
}

public class Qn3 {
	static BankAccount b;

	@BeforeAll
	public static void before() {
		b = new BankAccount();
		b.Account = 0;
	}

	@Test
	public void depositTest() {
		Assertions.assertEquals(100, b.deposit(100));
		Assertions.assertEquals(200, b.deposit(100));
		Assertions.assertEquals(500, b.deposit(300));
		Assertions.assertEquals(1000, b.deposit(500));
	}

	@Test
	public void withdrawTest() {
		Assertions.assertEquals(900, b.withdraw(100));
		Assertions.assertEquals(600, b.withdraw(300));
		Assertions.assertEquals(500, b.withdraw(100));
		Assertions.assertEquals(0, b.withdraw(500));
	}

	@AfterEach
	public void After() {
		System.out.println("Test done");
	}
}
