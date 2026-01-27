package workshop;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QN1 extends Remote{
	public String getDateAndTime() throws RemoteException;
}
