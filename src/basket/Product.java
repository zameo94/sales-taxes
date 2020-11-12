package basket;

public class Product {
	
	String name;
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
	 * @param qunatity
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
}
