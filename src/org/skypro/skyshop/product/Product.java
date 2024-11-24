package org.skypro.skyshop.product;

public abstract class Product {
    String title;

    public Product(String title) {
        this.title = title;
    }

    public abstract int getPrice();

    public String getTitle() {
        return title;
    }

    public boolean isSpecial() {
        return true;
    }
}
