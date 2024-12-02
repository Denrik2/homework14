package org.skypro.skyshop.product;

public class SimpleProduct extends Product implements Searchable{
    int price;

    public SimpleProduct(String title, int price) {
        super(title);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
