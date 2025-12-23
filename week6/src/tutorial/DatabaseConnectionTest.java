package tutorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Connect{
	public boolean ConnectDatabase(int num) {
		System.out.println("Connecting to database");
		if (num == 1 ) {
			System.out.println("Connected to Database");
			return true;
		}else {
			System.out.println("Couldn't connected to Database");
			return false;
		}
	}
}

public class DatabaseConnectionTest {
	int randNum = (int)(Math.random() * 2) + 1;
	
	Connect  c;
	
	@BeforeEach
	public void BeforeConnection() {
		System.out.println("Trying to connect to database");
		c = new Connect();
		System.out.println(randNum);
	}
	
	@Test
	public void Connected() {
		Assertions.assertTrue(c.ConnectDatabase(randNum));
	}
	
	@AfterEach
	public void AfterConnection() {
		System.out.println("Disconnecting to database");
	}
}
