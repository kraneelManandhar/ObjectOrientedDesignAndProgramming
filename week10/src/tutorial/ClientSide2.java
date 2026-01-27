package tutorial;

import java.rmi.Naming;

public class ClientSide2 {
	public static void main(String[] args) {
		try {
			Hello h  = (Hello) Naming.lookup("Hello");
			
			System.out.println("Response form server:  " + h.sayHello());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}