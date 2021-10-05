package com.reiska.orderapp;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private long id;
    private String customer;
    public List<Product> products = new ArrayList<>();

    private static long idCounter = 0;

    public Order(String customer) {
        this.id = idCounter++;;
        this.customer = customer;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

}

   