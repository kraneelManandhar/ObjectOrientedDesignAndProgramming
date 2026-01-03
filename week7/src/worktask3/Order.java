package worktask3;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * The Order class represents a completed purchase order.
 * It contains order details, customer information, and purchased items.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class Order {
    private String orderId;
    private Customer customer;
    private List<CartItem> items;
    private double totalAmount;
    private Date orderDate;

    /**
     * Constructs a new Order for the specified customer and items.
     *
     * @param customer the customer placing the order
     * @param items the items being purchased
     */
    public Order(Customer customer, List<CartItem> items) {
        this.orderId = "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.customer = customer;
        this.items = items;
        this.orderDate = new Date();
        calculateTotalAmount();
    }

    /**
     * Calculates the total amount for the order.
     */
    private void calculateTotalAmount() {
        totalAmount = 0.0;
        for (CartItem item : items) {
            totalAmount += item.getSubtotal();
        }
    }

    /**
     * Generates an invoice for the order.
     *
     * @return a formatted invoice string
     */
    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("========================================\n");
        invoice.append("               INVOICE                  \n");
        invoice.append("========================================\n");
        invoice.append(String.format("Order ID: %s%n", orderId));
        invoice.append(String.format("Date: %s%n", orderDate));
        invoice.append(String.format("Customer: %s%n", customer.getName()));
        invoice.append(String.format("Email: %s%n", customer.getEmail()));
        invoice.append("----------------------------------------\n");
        invoice.append("Items:\n");
        
        for (CartItem item : items) {
            invoice.append(String.format("  %s: $%.2f x %d = $%.2f%n",
                    item.getProduct().getName(),
                    item.getProduct().getPrice(),
                    item.getQuantity(),
                    item.getSubtotal()));
        }
        
        invoice.append("----------------------------------------\n");
        invoice.append(String.format("Total Amount: $%.2f%n", totalAmount));
        invoice.append("========================================\n");
        
        return invoice.toString();
    }

    /**
     * Gets the order ID.
     *
     * @return the order ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Gets the customer who placed the order.
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the items in the order.
     *
     * @return the list of items
     */
    public List<CartItem> getItems() {
        return items;
    }

    /**
     * Gets the total amount of the order.
     *
     * @return the total amount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Gets the order date.
     *
     * @return the order date
     */
    public Date getOrderDate() {
        return orderDate;
    }
}