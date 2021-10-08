package com.example.fashioncompany.Services;

import com.example.fashioncompany.Data.CustomerStorage;
import com.example.fashioncompany.Models.Customer;

import java.util.List;

public class CustomerServices {
    private CustomerStorage customerStore=CustomerStorage.getInstance();
    public  List<Customer> getCustomers(){

        return customerStore.getCustomers();
    }
    public Customer getParticularCustomer(String SSN){
        Customer customer=null;
        for(Customer cus:customerStore.getCustomers()){
            if(cus.getSSN().trim().equalsIgnoreCase(SSN)){
                customer=cus;
            }
        }
        return customer;
    }

    public String updateAddress(String customerSSN,String address){
        List<Customer>custom=CustomerStorage.getInstance().getCustomers();
        for(Customer c: custom){
            if(c.getSSN().trim().equalsIgnoreCase(customerSSN.trim())){
                c.setAddress(address);
                return c.getAddress();

            }
        }
        return null;

    }

}
