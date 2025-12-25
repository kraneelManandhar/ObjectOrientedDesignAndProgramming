package workshop;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

//5.	Complex Assertion with assertAll
//Write a class Product with fields name (String), price (double), and quantity (int). Write a method isAffordable(double budget) that returns true if the total price (price * quantity) is less than
//or equal to the given budget. Write a JUnit test that:
//●	Verifies that the name is not null.
//●	Verifies that the price is a positive value.
//●	Verifies that the isAffordable() method works correctly with different budgets using assertAll.

class Product {
	    String name;
	    double price;
	    int quantity;

	    public Product(String name, double price, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    boolean isAffordable(double budget) {
	        return (price * quantity) <= budget;
	    }
	}

public class Qn5 {
	@Test
	    void testProductAssertions() {
	        Product product = new Product("Laptop", 500.0, 2);

	        assertAll("Product validation",
	            () -> assertNotNull(product.name, "Name should not be null"),
	            () -> assertTrue(product.price > 0, "Price should be positive"),
	            () -> assertTrue(product.isAffordable(1000.0), "Should be affordable within budget"),
	            () -> assertFalse(product.isAffordable(900.0), "Should not be affordable within smaller budget"),
	            () -> assertTrue(product.isAffordable(1000.0), "Total equals budget should be affordable")
	        );
	}
}
