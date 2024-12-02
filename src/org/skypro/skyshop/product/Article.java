package org.skypro.skyshop.product;

public class Article implements Searchable{
    String title;
    String text;

    public String toString (){
        return title + '\n' + text;
    }

    public Article(String name, String text) {
        this.title = name;
        this.text = text;
    }
}
