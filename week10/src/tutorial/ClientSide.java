package tutorial;

import java.rmi.Naming;

public class ClientSide {
	public static void main(String[] args) {
		try {
			CalculatorService cs  = (CalculatorService) Naming.lookup("rmi://localhost:1015/CalculatorServices");
			
			int sum = cs.add(3, 7);
			
			System.out.println("Response form server: Sum:  " + sum);
			
			int difference = cs.subtract(3, 7);
			
			System.out.println("Response form server: Difference:  " + difference);
			
			int multiply = cs.multiply(3, 7);
			
			System.out.println("Response form server: Multiplication:  " + multiply);
			
			int divide = cs.divide(3, 7);
			
			System.out.println("Response form server: Division:  " + divide);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}