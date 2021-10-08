package com.example.fashioncompany.Services;

import com.example.fashioncompany.Data.CustomerStorage;
import com.example.fashioncompany.Models.Customer;
import com.example.fashioncompany.Models.Order;

import java.util.List;
import java.util.Objects;

public class OrderServices {
    public List<Order> getOrders(String SSN){
        List<Customer>customerStore=CustomerStorage.getInstance().getCustomers();
        List<Order> orders=null;
        for(Customer cus:customerStore){
            if(Objects.equals(cus.getSSN(), SSN)){
                orders=cus.getOrders();
            }
        }
        return orders;
    }
    public Order getOrder(String SSN,int orderId){
        List<Order> orders=getOrders(SSN);
        Order order=null;
        for(Order o:orders){
            if(o.getOrderId()==orderId){
                order=o;

            }
        }
        return order;

    }
    public Order addOrder(String customerSSN,Order order){
        List<Order> orders=null;
        List<Customer> customers=CustomerStorage.getInstance().getCustomers();
        for(Customer c: customers){
            if(c.getSSN().trim().equalsIgnoreCase(customerSSN.trim())){
                orders = c.getOrders();
                order.setOrderId((orders.size())+1);
                orders.add(order);
                c.setOrder(orders);
                return  order;

            }
        }
        return null;
    }


}
