package workshop;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class QN4Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            
            LocateRegistry.createRegistry(1099);
            
            QN4Implementation obj = new QN4Implementation();
            
            Naming.rebind("rmi://localhost:1099/QN4Service", obj);
            
            System.out.println("Listening on: rmi://localhost:1099/QN4Service");
            
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}