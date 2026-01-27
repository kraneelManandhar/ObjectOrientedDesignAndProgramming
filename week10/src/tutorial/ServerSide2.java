package tutorial;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerSide2 {
	public static void main(String[] args) {
		try {
			HelloImplementation csi = new HelloImplementation();
			LocateRegistry.createRegistry(1091);
			
			Naming.bind("rmi://localhost/Hello", csi);
			
			System.out.println("Server running");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}