package worktask3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ShoppingCart class represents a customer's shopping cart.
 * It maintains a collection of cart items and calculates the total price.
 * 
 * @author E-Commerce System
 * @version 1.0
 */
public class ShoppingCart {
    private Map<String, CartItem> cartItems;
    private double totalPrice;

    /**
     * Constructs an empty ShoppingCart.
     */
    public ShoppingCart() {
        this.cartItems = new HashMap<>();
        this.totalPrice = 0.0;
    }

    /**
     * Adds a product to the shopping cart with the specified quantity.
     *
     * @param product the product to add
     * @param quantity the quantity to add
     * @return true if the product was successfully added, false otherwise
     */
    public boolean addProduct(Product product, int quantity) {
        if (product == null || quantity <= 0 || !product.checkAvailability(quantity)) {
            return false;
        }

        String productId = product.getProductId();
        if (cartItems.containsKey(productId)) {
            CartItem existingItem = cartItems.get(productId);
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
        } else {
            cartItems.put(productId, new CartItem(product, quantity));
        }

        calculateTotalPrice();
        return true;
    }

    /**
     * Removes a product from the shopping cart.
     *
     * @param productId the ID of the product to remove
     * @return true if the product was successfully removed, false otherwise
     */
    public boolean removeProduct(String productId) {
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
            calculateTotalPrice();
            return true;
        }
        return false;
    }

    /**
     * Updates the quantity of a product in the shopping cart.
     *
     * @param productId the ID of the product to update
     * @param newQuantity the new quantity
     * @return true if the quantity was successfully updated, false otherwise
     */
    public boolean updateQuantity(String productId, int newQuantity) {
        if (cartItems.containsKey(productId)) {
            CartItem item = cartItems.get(productId);
            if (newQuantity > 0 && item.getProduct().checkAvailability(newQuantity)) {
                item.setQuantity(newQuantity);
                calculateTotalPrice();
                return true;
            } else if (newQuantity == 0) {
                return removeProduct(productId);
            }
        }
        return false;
    }

    /**
     * Calculates the total price of all items in the shopping cart.
     *
     * @return the total price
     */
    public double calculateTotalPrice() {
        totalPrice = 0.0;
        for (CartItem item : cartItems.values()) {
            totalPrice += item.getSubtotal();
        }
        return totalPrice;
    }

    /**
     * Returns a list of all cart items.
     *
     * @return a list of cart items
     */
    public List<CartItem> viewCartItems() {
        return new ArrayList<>(cartItems.values());
    }

    /**
     * Clears all items from the shopping cart.
     */
    public void clearCart() {
        cartItems.clear();
        totalPrice = 0.0;
    }

    /**
     * Gets the current total price of the shopping cart.
     *
     * @return the total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Gets the number of unique products in the cart.
     *
     * @return the number of unique products
     */
    public int getItemCount() {
        return cartItems.size();
    }

    /**
     * Gets the total quantity of all items in the cart.
     *
     * @return the total quantity
     */
    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (CartItem item : cartItems.values()) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }
}