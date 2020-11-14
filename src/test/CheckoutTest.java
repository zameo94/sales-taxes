package test;

import static org.junit.jupiter.api.Assertions.*;

import basket.Checkout;
import basket.Product;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CheckoutTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void testSetNewProduct(){
        Checkout checkout = new Checkout();
        Product product = checkout.setNewProduct("paper", "office", 14.99, 1, false);

        assertEquals("paper", product.getName());
        assertEquals("office", product.getType());
        assertEquals(14.99, product.getPrice());
        assertEquals(1, product.getQuantity());
        assertFalse(product.isImported());
        assertEquals(1.50, product.getTax());

    }

    @Test
    void testPrintInput(){
        Checkout checkout = new Checkout();
        List<Product> basketItems = new ArrayList<Product>();
        System.setOut(new PrintStream(outContent));


        Product product1 = checkout.setNewProduct("paper", "Office", 14.99, 1, false);
        Product product2 = checkout.setNewProduct("pen", "Office", 4.99, 1, false);

        basketItems.add(product1);
        basketItems.add(product2);

        checkout.printInput(basketItems);
        assertEquals("\nINPUT:\n" +
                "\n" +
                "1 paper at 14.99\n" +
                "1 pen at 4.99\n", outContent.toString());


    }
}
