package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    Product[] basket = new Product[5];
    private int totalCost;
    int t = 0;

    public void ProductBasket(Product product) {
        if (basket.length == this.t) {
            System.out.println("Невозможно добавить продукт");

        } else if (basket.length > t) {
            basket[t] = product;
            totalCost = totalCost + product.getPrice();
        }
        t++;
    }

    public int TotalCost() {
        return totalCost;
    }

    public void toSting() {
        System.out.println("ProductBasket.toSting");

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i].getTitle() + ": " + basket[i].getPrice());
            }
        }
        System.out.println("Итого:" + TotalCost());
    }

    public void CleaningBasket() {
        System.out.println("ProductBasket.CleaningBasket");

        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        totalCost = 0;

    }

    public void CheckProduct(String name) {
        System.out.println("ProductBasket.CheckProduct");

        int availability = 0;

        if (basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                if (basket[i].getTitle().equals(name)) {
                    availability += 1;
                }
            }
        } else {
            System.out.println("Корзина пустая");
        }
        if (availability == 1) {
            System.out.println("Товар есть");
        } else {
            System.out.println("Товара нет");
        }
    }
}