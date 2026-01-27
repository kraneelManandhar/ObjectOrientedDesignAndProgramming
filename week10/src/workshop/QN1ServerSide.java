package workshop;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class QN1ServerSide {
	public static void main(String[] args) {
		try {
			QN1Implementation csi = new QN1Implementation();
			LocateRegistry.createRegistry(1011);
			
			Naming.rebind("rmi://localhost:1011/QN1", csi);
			
			System.out.println("Server running");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}