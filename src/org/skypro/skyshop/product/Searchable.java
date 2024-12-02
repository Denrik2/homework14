package org.skypro.skyshop.product;

public interface Searchable {
    public void searchTerm();

    default public String getStringRepresentation(){
        return "Имя " + this.
    }

    public void getNameObject();
}
