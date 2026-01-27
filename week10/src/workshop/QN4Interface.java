package workshop;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QN4Interface extends Remote {
    String getMessage() throws RemoteException;
    int addNumbers(int x, int y) throws RemoteException;
    String checkNumber(int num) throws RemoteException;
    double calculateAverage(int a, int b, int c) throws RemoteException;
}