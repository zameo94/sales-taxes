package basket;

import java.util.Arrays;

public class Product {

	final String[] NO_TAXES_PRODUCT = {"book", "food", "medical"};

	String name;
	String type;
	double price;
	int quantity;
	boolean isImported;
	double tax;
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isImported() {
		return isImported;
	}
	
	/**
	 * 
	 * @param isImported
	 */
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getTax() {
		return tax;
	}
	
	/**
	 * 
	 * @param tax
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}

	/**
	 *
	 * @param product
	 * @return
	 */
	public double calculateTaxes(Product product)
	{
		double finalTax = 0;
		double finalTaxPrice;

		if(product.isImported()){
			finalTax += 5;
		}

		if(Arrays.asList(product.NO_TAXES_PRODUCT)
				.contains(product.type.toLowerCase())
		){
			finalTax = finalTax / 100;
			finalTaxPrice = product.price * finalTax;

			return Math.round(finalTaxPrice * 20.0) / 20.0;
		}

		finalTax += 10;
		finalTax = finalTax / 100;
		finalTaxPrice = product.price * finalTax;

		return Math.round(finalTaxPrice * 20.0) / 20.0;
	}
}
