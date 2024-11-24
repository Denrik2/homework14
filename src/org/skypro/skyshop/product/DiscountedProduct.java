package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    int basePrice;
    int  discount;

    public DiscountedProduct(String title, int basePrice, int  discount) {
        super(title);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return basePrice - (basePrice / 100 * discount);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
