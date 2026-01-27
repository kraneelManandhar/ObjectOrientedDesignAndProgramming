package workshop;

import java.rmi.Naming;

public class QN4Client {
	public static void main(String[] args) {
		try {
			System.setProperty("java.rmi.server.hostname", "127.0.0.1");

			QN4Interface remoteObj = (QN4Interface) Naming.lookup("rmi://localhost:1099/QN4Service");

			System.out.println("   Result: " + remoteObj.getMessage());

			System.out.println("   Result: " + remoteObj.addNumbers(15, 25));

			System.out.println("   Result: " + remoteObj.checkNumber(10));

			System.out.println("   Result: " + remoteObj.checkNumber(-5));

			System.out.println("   Result: " + remoteObj.calculateAverage(10, 20, 30));
			
			System.out.println("Done");

		} catch (Exception e) {
			System.out.println("Client Error: " + e);
		}
	}
}