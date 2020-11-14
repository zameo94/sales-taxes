package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import basket.Product;

class ProductTest {

	@Test
	void testGetterAndSetter() {
		Product product = this.randomProduct();
		String[] testNoTaxesProduct = {"book", "food", "medical"};
		
		assertEquals("Paper", product.getName());
		assertEquals("Office", product.getType());
		assertEquals(2.75, product.getPrice());
		assertEquals(2, product.getQuantity());
		assertFalse(product.isImported());
		assertEquals(0.05, product.getTax());
	}

	@Test
	void testCalculateTaxes(){
		Product product = this.randomProduct();

		// Test imported special product
		product.setImported(true);
		product.setType("Food");
		product.setTax(product.calculateTaxes(product));

		assertEquals(0.05, product.getTax());

		// Test NO imported NO special product
		product.setImported(false);
		product.setType("Office");
		product.setTax(product.calculateTaxes(product));

		assertEquals(0.1, product.getTax());

		// Test imported NO special product
		product.setImported(true);
		product.setType("Office");
		product.setTax(product.calculateTaxes(product));

		assertEquals(0.15, product.getTax());
	}

	/**
	 *
	 * @return
	 */
	Product randomProduct(){
		Product product = new Product();

		product.setName("Paper");
		product.setType("Office");
		product.setPrice(2.75);
		product.setQuantity(2);
		product.setImported(false);
		product.setTax(0.05);

		return product;
	}

}
