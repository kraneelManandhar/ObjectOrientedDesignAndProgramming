package worktask3;

import java.util.ArrayList;
import java.util.List;

/**
 * The Customer class represents a customer in the e-commerce system. Customers
 * can register, login, browse products, add items to cart, and checkout.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class Customer {
	private String customerId;
	private String name;
	private String email;
	private String password;
	private ShoppingCart shoppingCart;
	private boolean isLoggedIn;

	/**
	 * Constructs a new Customer with the specified details.
	 *
	 * @param customerId the unique identifier for the customer
	 * @param name       the name of the customer
	 * @param email      the email of the customer
	 * @param password   the password for the customer account
	 */
	public Customer(String customerId, String name, String email, String password) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.shoppingCart = new ShoppingCart();
		this.isLoggedIn = false;
	}

	/**
	 * Registers the customer in the system. In a real system, this would save the
	 * customer to a database.
	 *
	 * @return true if registration is successful, false otherwise
	 */
	public boolean register() {
		// In a real implementation, this would save to database
		// and validate unique email, etc.
		System.out.println("Customer registered: " + email);
		return true;
	}

	/**
	 * Attempts to log in the customer with the provided credentials.
	 *
	 * @param email    the email to login with
	 * @param password the password to login with
	 * @return true if login is successful, false otherwise
	 */
	public boolean login(String email, String password) {
		if (this.email.equals(email) && this.password.equals(password)) {
			isLoggedIn = true;
			System.out.println("Login successful for: " + email);
			return true;
		}
		System.out.println("Login failed for: " + email);
		return false;
	}

	/**
	 * Logs out the customer.
	 */
	public void logout() {
		isLoggedIn = false;
		System.out.println("Logged out: " + email);
	}

	/**
	 * Simulates viewing available products. In a real system, this would fetch from
	 * a database.
	 *
	 * @return a list of available products
	 */
	public List<Product> viewProducts() {
		// Simulating product retrieval
		List<Product> products = new ArrayList<>();
		products.add(new Product("P001", "Laptop", 999.99, 10));
		products.add(new Product("P002", "Mouse", 29.99, 50));
		products.add(new Product("P003", "Keyboard", 79.99, 30));
		products.add(new Product("P004", "Monitor", 299.99, 15));

		System.out.println("Products available:");
		for (Product product : products) {
			System.out.println(product.getDetails());
		}

		return products;
	}

	/**
	 * Adds a product to the customer's shopping cart.
	 *
	 * @param product  the product to add
	 * @param quantity the quantity to add
	 * @return true if the product was successfully added, false otherwise
	 */
	public boolean addToCart(Product product, int quantity) {
		if (!isLoggedIn) {
			System.out.println("Please login first");
			return false;
		}

		boolean success = shoppingCart.addProduct(product, quantity);
		if (success) {
			System.out.printf("Added %d x %s to cart%n", quantity, product.getName());
		} else {
			System.out.println("Failed to add product to cart");
		}
		return success;
	}

	/**
	 * Proceeds to checkout, creating an order from the cart contents.
	 *
	 * @return the created order, or null if checkout fails
	 */
	public Order checkout() {
		if (!isLoggedIn) {
			System.out.println("Please login first");
			return null;
		}

		List<CartItem> cartItems = shoppingCart.viewCartItems();
		if (cartItems.isEmpty()) {
			System.out.println("Cart is empty");
			return null;
		}

		// Check stock availability for all items
		for (CartItem item : cartItems) {
			if (!item.getProduct().checkAvailability(item.getQuantity())) {
				System.out.println("Insufficient stock for: " + item.getProduct().getName());
				return null;
			}
		}

		// Decrease stock for all items
		for (CartItem item : cartItems) {
			item.getProduct().decreaseStock(item.getQuantity());
		}

		// Create order
		Order order = new Order(this, cartItems);
		shoppingCart.clearCart();

		System.out.println("Checkout successful!");
		System.out.println("Order ID: " + order.getOrderId());
		System.out.println("Total: $" + order.getTotalAmount());

		return order;
	}

	/**
	 * Gets the customer ID.
	 *
	 * @return the customer ID
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Gets the customer name.
	 *
	 * @return the customer name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the customer email.
	 *
	 * @return the customer email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Checks if the customer is logged in.
	 *
	 * @return true if logged in, false otherwise
	 */
	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	/**
	 * Gets the customer's shopping cart.
	 *
	 * @return the shopping cart
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	/**
	 * Views the contents of the shopping cart.
	 */
	public void viewCart() {
		List<CartItem> items = shoppingCart.viewCartItems();
		if (items.isEmpty()) {
			System.out.println("Cart is empty");
		} else {
			System.out.println("Cart Contents:");
			for (CartItem item : items) {
				System.out.println(item);
			}
			System.out.printf("Total: $%.2f%n", shoppingCart.getTotalPrice());
		}
	}
}