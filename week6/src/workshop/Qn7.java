package workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//	7.	In a notification service, you need to implement a sendEmail(String email, String message) method to send an email.
//	The method should return true if the email is sent successfully and false if the email address is invalid.

class NotificationCenter{
	
	 public boolean sendEmail(String email, String message) {

	        if (email == null || !email.contains("@") || !email.contains(".")) {
	            return false;
	        }
	        System.out.println(message + " send to " + email);
	        return true;
	    }
}

public class Qn7 {
	NotificationCenter nc;
	@BeforeEach
	void BeforeTest() {
		nc = new NotificationCenter();
	}
	
	@Test
	void sendEmailTest() {
		Assertions.assertAll(
				() -> Assertions.assertFalse(nc.sendEmail("kraneel", "Hello")),
				() -> Assertions.assertTrue(nc.sendEmail("kraneel@gmail.com", "Byee"))
			);
	}
}
