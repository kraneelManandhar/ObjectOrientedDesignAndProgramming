package tutorial;

final class BankAccount {
	private final long accountNo;
	private double balance;

	public long getAccountNumber() {
		return this.accountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println(amount + " has been added.");
		} else {
			System.out.println("Please enter a valid amount");
		}
	}

	public void withdraw(double amount) {
		if (amount < 0 || this.balance < amount) {
			System.out.println("Enter valid amount to withdraw.");
		} else {
			this.balance -= amount;
			System.out.println(amount + " has been withdrawn from " + this.accountNo);
		}
	}
	
	public BankAccount (double balance,long accountNo) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000,1234567890);
//		acc.setAccountNumber(11111111);
//		acc.setBalance(67890);

		System.out.println(acc.getAccountNumber());

		acc.deposit(100);
		System.out.println(acc.getBalance());

		acc.withdraw(700);
		System.out.println("The balance in your acc is " + acc.getBalance());
	}
}
