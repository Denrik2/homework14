package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Apple green", 100);
        Product bag = new Product("bag", 1000);
        Product banana = new Product("banana", 90);
        Product sausages = new Product("sausages", 400);
        Product iceCream = new Product("ice cream", 50);
        Product pepper = new Product("pepper", 300);

        ProductBasket pac1 = new ProductBasket();
        pac1.addProduct(apple);
        pac1.addProduct(bag);
        pac1.addProduct(banana);
        pac1.addProduct(sausages);
        pac1.addProduct(iceCream);
        pac1.addProduct(pepper);
        System.out.println(pac1.toString());
        pac1.checkProductAvailability("bag");
        pac1.checkProductAvailability("kiwi");
        pac1.clearBasket();
        System.out.println(pac1.toString());
        pac1.checkProductAvailability("bag");


    }
}