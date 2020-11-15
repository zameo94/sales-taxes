package basket;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<Product> basketItems = new ArrayList<Product>();

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        //Simulate 1th checkout
        System.out.println("1th Checkout:");

        checkout.basketItems.add(checkout.setNewProduct("book", "book", 12.49, 2, false));
        checkout.basketItems.add(checkout.setNewProduct("music CD", "music", 14.99, 1, false));
        checkout.basketItems.add(checkout.setNewProduct("chocolate bar", "food", 0.85, 1, false));

        checkout.printInput(checkout.basketItems);
        checkout.printOutput(checkout.basketItems);

        //Simulate 2nd checkout
        System.out.println("\n2nd Checkout:");
        checkout.basketItems.clear();

        checkout.basketItems.add(checkout.setNewProduct("box of chocolates", "food", 10.00, 1, true));
        checkout.basketItems.add(checkout.setNewProduct("bottle of perfume", "perfume", 47.50, 1, true));

        checkout.printInput(checkout.basketItems);
        checkout.printOutput(checkout.basketItems);

        //Simulate 3rd checkout
        System.out.println("\n3rd Checkout:");
        checkout.basketItems.clear();

        checkout.basketItems.add(checkout.setNewProduct("bottle of perfume", "perfume", 27.99, 1, true));
        checkout.basketItems.add(checkout.setNewProduct("bottle of perfume", "perfume", 18.99, 1, false));
        checkout.basketItems.add(checkout.setNewProduct("packet of headache pills", "medical", 9.75, 1, false));
        checkout.basketItems.add(checkout.setNewProduct("box of chocolates", "food", 11.25, 3, true));

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
            String isImported = " ";

            if(item.isImported()){
                isImported = " imported ";
            }

            System.out.println(item.getQuantity() + isImported + item.getName() + " at " + item.getPrice());
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
            finalPrice = ( (((item.getPrice() * 100) + (item.getTax() * 100)) * item.getQuantity()) / 100);
            salesTaxes = ((salesTaxes * 100) + ((item.getTax() * item.getQuantity()) * 100)) / 100;
            total += (finalPrice * 100);
            String isImported = " ";

            if(item.isImported()){
                isImported = " imported ";
            }

            System.out.println(item.getQuantity() + isImported + item.getName() + ": " + finalPrice);
        }

        System.out.println("Sales Taxes: " + salesTaxes);
        System.out.println("Total: " + total / 100);
    }
}
