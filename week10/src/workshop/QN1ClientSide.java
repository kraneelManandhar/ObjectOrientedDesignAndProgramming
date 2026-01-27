package workshop;

import java.rmi.Naming;
import workshop.QN1;

public class QN1ClientSide {
	public static void main(String[] args) {
		try {
			    QN1 qn = (QN1) Naming.lookup("rmi://localhost:1011/QN1");
			    String serverTime = qn.getDateAndTime();
			    System.out.println("Response from server: " + serverTime);
			} catch (Exception e) {
			    e.printStackTrace();
			}
	}
}