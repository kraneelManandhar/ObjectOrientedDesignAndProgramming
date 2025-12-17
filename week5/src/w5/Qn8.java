package w5;

 interface Payment {
	    void processPayment();
	}

 class Paypal implements Payment {
	   @Override
	   public void processPayment() {
	      System.out.println("Processing PayPal payment");
	   }
	}

	 class Order {
	   
	   private Payment payment;

	   public Order(Payment payment) {
	      this.payment = payment;
	   }

	   public void makePayment() {
	      payment.processPayment();
	   }
	}