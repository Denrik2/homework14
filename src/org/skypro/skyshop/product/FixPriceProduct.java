package org.skypro.skyshop.product;

public class FixPriceProduct extends Product implements Searchable{
    private static final int price = 1000;

    public FixPriceProduct(String title) {
        super(title);

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
