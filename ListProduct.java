package com.models;

import java.util.ArrayList;

public class ListProduct {
    private ArrayList<Product> products;

    public ListProduct() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void generate_sample_dataset() {
        ListCategory listCategory = new ListCategory();
        listCategory.generate_sample_dataset();

        addProduct(new Product(1, "iPhone 15", 999.99, listCategory.getCategories().get(0)));
        addProduct(new Product(2, "T-Shirt", 19.99, listCategory.getCategories().get(1)));
        addProduct(new Product(3, "Java Programming", 29.99, listCategory.getCategories().get(2)));
        addProduct(new Product(4, "Chocolate", 5.99, listCategory.getCategories().get(3)));
    }
}
