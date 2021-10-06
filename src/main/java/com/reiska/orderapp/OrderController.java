package com.reiska.orderapp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("products")
    public List<Product> getProducts(){
        return orderService.products;
    }

    @GetMapping("orders")
    public List<Order> getOrders(){
        return orderService.orders;
    }

    @GetMapping("orders/{name}")
    public List<Order> getCustomerOrders(@PathVariable String name){
        return orderService.getOrdersByName(name);
    }

    @GetMapping("products/{name}")
    public List<Product> getCustomerProducts(@PathVariable String name){
        return orderService.getProductsByCustomer(name);
    }

    @PostMapping("create")
    public String addProduct(@RequestBody Product product ){

        orderService.products.add(product);

        return "Lisäys onnistui!";
    }
}
