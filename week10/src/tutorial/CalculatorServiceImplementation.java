package tutorial;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServiceImplementation extends UnicastRemoteObject implements CalculatorService{
	
	protected CalculatorServiceImplementation() throws RemoteException{
		super();
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
	}
	
	
}