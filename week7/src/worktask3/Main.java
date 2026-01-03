package worktask3;

/**
 * Main class demonstrating the e-commerce system functionality.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-Commerce Shopping Cart System ===\n");
        
        // Create a customer
        Customer customer = new Customer("C001", "John Doe", "john@example.com", "password123");
        
        // Register the customer
        customer.register();
        
        // Login
        customer.login("john@example.com", "password123");
        
        // View products
        System.out.println("\n--- Viewing Products ---");
        var products = customer.viewProducts();
        
        // Add products to cart
        System.out.println("\n--- Adding to Cart ---");
        customer.addToCart(products.get(0), 1); // Laptop
        customer.addToCart(products.get(1), 2); // Mouse
        customer.addToCart(products.get(2), 1); // Keyboard
        
        // View cart
        System.out.println("\n--- Viewing Cart ---");
        customer.viewCart();
        
        // Checkout
        System.out.println("\n--- Checkout Process ---");
        Order order = customer.checkout();
        
        // Display invoice
        if (order != null) {
            System.out.println("\n--- Order Invoice ---");
            System.out.println(order.generateInvoice());
        }
        
        // Logout
        customer.logout();
    }
}