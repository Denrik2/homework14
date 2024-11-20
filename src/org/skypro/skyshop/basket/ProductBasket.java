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
    }

    public int TotalCost() {
        return totalCost;
    }

    public void toSting() {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i].getTitle() + ": " + basket[i].getPrice());
            }
        }
        System.out.println("Итого:" + TotalCost());
    }

    public void CleaningBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
                }
        } else {
        }
        }
    }
}