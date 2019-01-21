package com.epam.rd.onlineStore.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private static long maxId;
    private long id;
    private String name;
    private int category;
    private double price;
    private String image;

    public Product() {
    }

    public Product(long id, String name, int category, double price, String image) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.image = image;
    }

//    public Product(String name, int category, double price, String image) {
//        this.id = ++maxId;
//        this.name = name;
//        this.category = category;
//        this.price = price;
//        this.image = image;
//    }

    public void generateId(Product product) {
        if (product.id == 0) {
            product.id = ++maxId;
        }
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getMaxId() {
        return maxId;
    }

    public static void setMaxId(long maxId) {
        Product.maxId = maxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
