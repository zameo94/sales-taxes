package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import basket.Product;

class ProductTest {

	@Test
	void testGetterAndSetter() {
		Product product = this.randomProduct();
		
		assertEquals("paper", product.getName());
		assertEquals("office", product.getType());
		assertEquals(14.99, product.getPrice());
		assertEquals(2, product.getQuantity());
		assertFalse(product.isImported());
		assertEquals(0.05, product.getTax());
	}

	@Test
	void testCalculateTaxes(){
		Product product = this.randomProduct();

		// Test imported special product
		product.setImported(true);
		product.setType("food");
		product.setTax(product.calculateTaxes(product));

		assertEquals(0.75, product.getTax());

		// Test NO imported NO special product
		product.setImported(false);
		product.setType("office");
		product.setTax(product.calculateTaxes(product));

		assertEquals(1.5, product.getTax());

		// Test imported NO special product
		product.setImported(true);
		product.setType("office");
		product.setTax(product.calculateTaxes(product));

		assertEquals(2.25, product.getTax());
	}

	/**
	 *
	 * @return
	 */
	Product randomProduct(){
		Product product = new Product();

		product.setName("paper");
		product.setType("office");
		product.setPrice(14.99);
		product.setQuantity(2);
		product.setImported(false);
		product.setTax(0.05);

		return product;
	}
}
