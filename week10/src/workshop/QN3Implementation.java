package workshop;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class QN3Implementation extends UnicastRemoteObject implements QN3 {
	    
	    public QN3Implementation() throws RemoteException { super(); }

	    public String getStudentDetails(int id) {
	        if(id == 101) return "Name: Manandhar, Marks: 90";
	        if(id == 102) return "Name: Rai , Marks: 85";
	        return "Student Not Found";
	    }
	}