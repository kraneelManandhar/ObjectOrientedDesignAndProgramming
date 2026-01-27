package workshop;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;

public class QN1Implementation extends UnicastRemoteObject implements QN1 {
	protected QN1Implementation() throws RemoteException{
		super();
	}
	
	public String getDateAndTime() throws RemoteException {
	        return LocalDateTime.now().toString();
	}
}