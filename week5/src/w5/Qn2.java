package w5;

interface PaymentMethod {
    void pay();
}

class CreditCardPayment  implements PaymentMethod{
	  public void pay() {
		  System.out.println("Paid with CreditCard");
	  }
	}

class EsewaPayment implements PaymentMethod{
	 public void pay() {
		  System.out.println("Paid with Eewa");
	  }
}

class CashPayment implements PaymentMethod{
	 public void pay() {
		  System.out.println("Paid with Cash");
	  }
}

public class Qn2 {
	
}