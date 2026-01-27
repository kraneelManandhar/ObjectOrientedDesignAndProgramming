package tutorial;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerSide {
	public static void main(String[] args) {
		try {
			CalculatorServiceImplementation csi = new CalculatorServiceImplementation();
			LocateRegistry.createRegistry(1015);
			
			Naming.rebind("rmi://localhost:1015/CalculatorServices", csi);
			
			System.out.println("Server running");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}