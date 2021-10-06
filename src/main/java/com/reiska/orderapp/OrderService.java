package com.reiska.orderapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public List<Order> orders = new ArrayList<>();
    public List<Product> products = new ArrayList<>();


    public OrderService(){
        products.add(new Product("Macbook pro"));
        products.add(new Product("Genelec"));
        products.add(new Product("Adobe CS"));
        products.add(new Product("Behringer A345"));
        products.add(new Product("HP Laptop"));
        products.add(new Product("XLR 3m"));

        Order o1 = new Order("Matti");
        o1.products.add(products.get(0));
        o1.products.add(products.get(2));
        o1.products.add(products.get(3));
        
        Order o2 = new Order("Liisa");
        o2.products.add(products.get(1));

        Order o3 = new Order("Liisa");
        o3.products.add(products.get(4));
        o3.products.add(products.get(5));

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
    }

    public List<Order> getOrdersByName(String name){

        List<Order> found = new ArrayList<>();

        for (Order order : orders) {
            if(order.getCustomer().equals(name)){
                found.add(order);
            }
        }
        return found;
    }

    public List<Product> getProductsByCustomer(String name){
        List<Order> customerOrders = getOrdersByName(name);

        List<Product> customerProducts = new ArrayList<>();

        for (Order order : customerOrders) {
            customerProducts.addAll(order.products);
        }

        return customerProducts;
    }
}
