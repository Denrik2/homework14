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
        pac1.ProductBasket(apple);
        pac1.ProductBasket(bag);
        pac1.ProductBasket(banana);
        pac1.ProductBasket(sausages);
        pac1.ProductBasket(iceCream);
        pac1.ProductBasket(pepper);
        pac1.toSting();
        pac1.CheckProduct("bag");
    }
}