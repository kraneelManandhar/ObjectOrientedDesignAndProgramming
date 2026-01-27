package tutorial;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementation extends UnicastRemoteObject implements Hello{
	
	protected HelloImplementation() throws RemoteException{
		super();
	}
	
	public String sayHello() {
		return "Hello";
	}
}