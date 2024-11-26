package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class ProductBasket {
    Product[] basket = new Product[5];
    private int totalCost;
    int t = 0;

    public void addProduct(Product product) {
        if (basket.length == this.t) {
            System.out.println("Невозможно добавить продукт");

        } else if (basket.length > t && t <= 5) {
            basket[t] = product;
            totalCost = totalCost + product.getPrice();
            t++;
        }
    }

    public int getTotalCost() {
        return totalCost;
    }

    public String toString() {
        byte counter = 0;
        String a = "";
        if (basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null && !basket[i].isSpecial()) {
                    a += basket[i].getTitle() + ": " + basket[i].getPrice() + ";\n ";
                } else if (basket[i] != null && basket[i].isSpecial()) {
                    counter ++;
                    a += basket[i].getTitle() + ": " + basket[i].getPrice() + ";\n ";
                }
            }
            return a + " Итого:" + getTotalCost() + "\n Специальных товаров: " + counter;
        }else {
            return "Корзина пуста. Итого: " + getTotalCost();
        }
    }

    public void clearBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        totalCost = 0;
    }

    public void checkProductAvailability(String name) {
        int availability = 0;

        if (basket[0] != null) {
            for (int i = 0;i < basket.length; i++) {
                if (basket[i].getTitle().equals(name) && basket[i].getTitle() != null) {
                    availability += 1;
                    System.out.println("Товар есть");
                }
            }
        }
        if (availability == 0) {
            System.out.println("Товара нет");
        }
    }
}



