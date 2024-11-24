package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        SimpleProduct apple = new SimpleProduct("Apple green", 100);
        DiscountedProduct bag = new DiscountedProduct("bag", 1000, 10);
        SimpleProduct banana = new SimpleProduct("banana", 90);
        FixPriceProduct sausages = new FixPriceProduct("sausages");
        SimpleProduct iceCream = new SimpleProduct("ice cream", 50);
        SimpleProduct pepper = new SimpleProduct("pepper", 300);

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