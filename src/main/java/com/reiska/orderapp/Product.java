package com.reiska.orderapp;


public class Product {

    private long id;
    private String name;
    private static long idCounter = 0;

    public Product(){
        this("");
    }

    public Product(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
