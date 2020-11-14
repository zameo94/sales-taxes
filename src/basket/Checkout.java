package basket;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<Product> items = new ArrayList<Product>();

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.items.add(checkout.setNewProduct("book", "book", 12.49, 2, false));
        checkout.items.add(checkout.setNewProduct("music CD", "music", 14.99, 1, false));
        checkout.items.add(checkout.setNewProduct("chocolate bar", "food", 0.85, 1, false));

        //for
    }

    /**
     *
     * @param name
     * @param type
     * @param price
     * @param quantity
     * @param isImported
     * @return
     */
    public Product setNewProduct(String name, String type, double price, int quantity, boolean isImported){
        Product product = new Product();

        product.setName(name);
        product.setType(type);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setImported(isImported);
        product.setTax(product.calculateTaxes(product));

        return product;
    }
}
