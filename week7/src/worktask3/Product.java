package worktask3;

/**
 * The Product class represents a product in the e-commerce system.
 * Each product has a unique identifier, name, price, and stock quantity.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    /**
     * Constructs a new Product with the specified details.
     *
     * @param productId the unique identifier for the product
     * @param name the name of the product
     * @param price the price of the product
     * @param stockQuantity the available quantity in stock
     */
    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Returns a string containing all product details.
     *
     * @return a formatted string with product details
     */
    public String getDetails() {
        return String.format("Product ID: %s, Name: %s, Price: $%.2f, Stock: %d",
                productId, name, price, stockQuantity);
    }

    /**
     * Checks if the requested quantity of product is available.
     *
     * @param quantity the quantity to check availability for
     * @return true if the requested quantity is available, false otherwise
     */
    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    /**
     * Decreases the stock quantity by the specified amount.
     *
     * @param quantity the quantity to decrease stock by
     * @throws IllegalArgumentException if quantity exceeds available stock
     */
    public void decreaseStock(int quantity) {
        if (quantity > stockQuantity) {
            throw new IllegalArgumentException("Insufficient stock");
        }
        stockQuantity -= quantity;
    }

    /**
     * Gets the product ID.
     *
     * @return the product ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the product price.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the stock quantity.
     *
     * @return the stock quantity
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Sets the stock quantity.
     *
     * @param stockQuantity the new stock quantity
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}