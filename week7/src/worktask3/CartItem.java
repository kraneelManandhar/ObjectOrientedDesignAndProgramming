package worktask3;

/**
 * The CartItem class represents an item in the shopping cart.
 * It contains a product and its quantity in the cart.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class CartItem {
    private Product product;
    private int quantity;

    /**
     * Constructs a new CartItem with the specified product and quantity.
     *
     * @param product the product to add to cart
     * @param quantity the quantity of the product
     */
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Gets the product in this cart item.
     *
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Gets the quantity of this product in the cart.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of this product in the cart.
     *
     * @param quantity the new quantity
     * @throws IllegalArgumentException if quantity is negative
     */
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    /**
     * Calculates the subtotal for this cart item.
     *
     * @return the subtotal (price × quantity)
     */
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    /**
     * Returns a string representation of the cart item.
     *
     * @return formatted string with product details and quantity
     */
    @Override
    public String toString() {
        return String.format("%s x%d = $%.2f",
                product.getName(), quantity, getSubtotal());
    }
}