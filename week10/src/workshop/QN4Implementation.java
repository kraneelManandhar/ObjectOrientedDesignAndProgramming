package workshop;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class QN4Implementation extends UnicastRemoteObject implements QN4Interface {

	public QN4Implementation() throws RemoteException {
		super();
	}

	public String getMessage() throws RemoteException {
		return "Hello from RMI Server!";
	}

	public int addNumbers(int x, int y) throws RemoteException {
		return x + y;
	}

	public String checkNumber(int num) throws RemoteException {
		if (num > 0)
			return "Positive Number";
		else if (num < 0)
			return "Negative Number";
		else
			return "Zero";
	}

	public double calculateAverage(int a, int b, int c) throws RemoteException {
		return (a + b + c) / 3.0;
	}
}
