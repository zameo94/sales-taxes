package test;

import static org.junit.jupiter.api.Assertions.*;

import basket.Checkout;
import basket.Product;
import org.junit.jupiter.api.Test;

public class CheckoutTest {
    @Test
    void testSetNewProduct(){
        Checkout checkout = new Checkout();
        Product product = checkout.setNewProduct("Paper", "Office", 14.99, 1, false);

        assertEquals("Paper", product.getName());
        assertEquals("Office", product.getType());
        assertEquals(14.99, product.getPrice());
        assertEquals(1, product.getQuantity());
        assertFalse(product.isImported());
        assertEquals(1.50, product.getTax());

    }
}
