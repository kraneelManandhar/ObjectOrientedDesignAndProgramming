package w5;

interface PaymentMethods {
	void transfer(double amount);
}

class CreditCardPayments implements PaymentMethods {
	public void transfer(double amount) {
		System.out.println("Paid " + amount + " using Credit Card");
	}
}

class PayPalPayment implements PaymentMethods {
	public void transfer(double amount) {
		System.out.println("Paid " + amount + " using PayPal");
	}
}

class EsewaPayments implements PaymentMethods {
	public void transfer(double amount) {
		System.out.println("Paid " + amount + " using Esewa");
	}
}

class KhaltiPayment implements PaymentMethods {
	public void transfer(double amount) {
		System.out.println("Paid " + amount + " using Khalti");
	}
}

public class Qn5 {
	public static void main(String[] args) {
		PaymentMethods pm =  new CreditCardPayments();
		pm.transfer(200.00);
	}
}