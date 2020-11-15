package basket;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<Product> basketItems = new ArrayList<Product>();

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.basketItems.add(checkout.setNewProduct("book", "book", 12.49, 2, false));
        checkout.basketItems.add(checkout.setNewProduct("music CD", "music", 14.99, 1, false));
        checkout.basketItems.add(checkout.setNewProduct("chocolate bar", "food", 0.85, 1, false));

        checkout.printInput(checkout.basketItems);
        checkout.printOutput(checkout.basketItems);
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

    /**
     *
     * @param basketItems
     */
    public void printInput(List<Product> basketItems){
        System.out.println("\nINPUT:\n");

        for(int i = 0; i < basketItems.size(); i++){
            Product item = basketItems.get(i);
            System.out.println(item.getQuantity() + " " + item.getName() + " at " + item.getPrice());
        }
    }

    /**
     *
     * @param basketItems
     */
    public void printOutput(List<Product> basketItems){
        double finalPrice;
        double salesTaxes = 0;
        double total = 0;

        System.out.println("\nOUTPUT:\n");

        for(int i = 0; i < basketItems.size(); i++){
            Product item = basketItems.get(i);
            finalPrice = (((item.getPrice() * 100) + (item.getTax() * 100)) / 100) * item.getQuantity();
            salesTaxes += item.getTax();
            total += finalPrice;

            System.out.println(item.getQuantity() + " " + item.getName() + " at " + finalPrice);
        }

        System.out.println("Sales Taxes: " + salesTaxes);
        System.out.println("Total: " + total);
    }
}
