package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import basket.Product;

class ProductTest {

	@Test
	void testGetterAndSetter() {
		Product product = new Product();
		
		product.setName("Matteo");
		product.setPrice(2.75);
		product.setQuantity(2);
		product.setImported(false);
		product.setTax(0.05);
		
		assertEquals("Matteo", product.getName());
		assertEquals(2.75, product.getPrice());
		assertEquals(2, product.getQuantity());
		assertEquals(false, product.isImported());
		assertEquals(0.05, product.getTax());
	}

}
