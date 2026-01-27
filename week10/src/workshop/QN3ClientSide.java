package workshop;

import java.rmi.Naming;

public class QN3ClientSide {
	public static void main(String[] args) {
		try {
			    QN3 qn = (QN3) Naming.lookup("rmi://localhost:1013/QN3");
			    String student101 = qn.getStudentDetails(101);
			    String student102 = qn.getStudentDetails(102);
			    String student103 = qn.getStudentDetails(103);
			    
			    System.out.println("Response from server:  " );
			    System.out.println(student101);
			    System.out.println(student102);
			    System.out.println(student103);
			    
			} catch (Exception e) {
			    e.printStackTrace();
			}
	}
}