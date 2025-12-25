package workshop;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//In an inventory management system, you need a method isProductAvailable(String productName, int quantity) to check if the given product is in stock. 
//The method should return true if the requested quantity is available in stock and false if the requested quantity exceeds the available stock.

class Inventory {

	    private Map<String, Integer> stock = new HashMap<>();

	    public void addProduct(String productName, int quantity) {
	        stock.put(productName, quantity);
	    }

	    public boolean isProductAvailable(String productName, int quantity) {
	        if (!stock.containsKey(productName)) {
	            return false;
	        }

	        int availableQuantity = stock.get(productName);
	        return availableQuantity >= quantity;
	    }
	}

public class Qn6 {
	static Inventory inventory ;
	@BeforeAll
	static void initialize() {
		inventory = new Inventory();
	}
	
	 @Test
	 
	    void inventoryTest() {
	        inventory.addProduct("Pen", 10);

	        Assertions.assertTrue(
	            inventory.isProductAvailable("Pen", 5)
	        );

	        Assertions.assertFalse(
	            inventory.isProductAvailable("Pen", 15)
	        );

	        Assertions.assertFalse(
	            inventory.isProductAvailable("Book", 1)
	        );
	    }
}
