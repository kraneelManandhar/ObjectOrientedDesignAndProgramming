package workshop;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class QN3ServerSide {
    public static void main(String[] args) {
        try {
            // Add these lines
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            
            QN3Implementation csi = new QN3Implementation();
            LocateRegistry.createRegistry(1013);
            
            Naming.rebind("rmi://127.0.0.1:1013/QN3", csi);
            
            System.out.println("Server running");
        } catch(Exception e) {
            e.printStackTrace(); // Use this instead of getMessage() for full trace
        }
    }
}