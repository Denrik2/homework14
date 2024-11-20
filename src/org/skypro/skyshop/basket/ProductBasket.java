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
        if (basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null) {
                    System.out.println(basket[i].getTitle() + ": " + basket[i].getPrice());
                }
            }
            System.out.println("Итого:" + TotalCost());
        }else {
            System.out.println("Корзина пуста. Итого: " + TotalCost());
        }
    }

    public void CleaningBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        totalCost = 0;
    }

    public void ProductAvailability(String name) {
        int availability = 0;

        if (basket[0] != null) {
            for (int i = 0;i < basket.length; i++) {
                if (basket[i].getTitle().equals(name)) {
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



