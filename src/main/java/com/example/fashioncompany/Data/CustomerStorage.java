package com.example.fashioncompany.Data;

import com.example.fashioncompany.Models.Customer;
import com.example.fashioncompany.Models.Order;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {
    private static CustomerStorage customerStorage;
    List<Customer> customers;
    private CustomerStorage(){
        customers=new ArrayList<Customer>();
        customers.add(new Customer("9208038795","Mike","Docent's6B","male"));
        customers.add(new Customer("9008038795","Mikela","Docentgatan6B","male"));
           List<Order>orders=new ArrayList<Order>();
           orders.add(new Order(1,"210506",200,"payed"));
           orders.add(new Order(2,"22222",230,"notpaid"));




        customers.get(0).setOrder(orders);

    }
    public static CustomerStorage getInstance() {
        if (customerStorage == null) {
            customerStorage = new CustomerStorage();

        }
        return customerStorage;
    }
        public List<Customer> getCustomers(){
            return customers;
        }

    }


