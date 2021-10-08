package com.example.fashioncompany.Resources;
import com.example.fashioncompany.Models.Customer;
import com.example.fashioncompany.Services.CustomerServices;
import com.example.fashioncompany.Services.OrderServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customers")
public class CustomerResources {
    CustomerServices customerService=new CustomerServices();
    OrderServices orderServices=new OrderServices();
    @GET
    @Produces("application/json")
    public List<Customer>getCustomers(){
        return customerService.getCustomers();
    }

    @GET
    @Path("/{customerSSN}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("customerSSN")String customerSSN){
        return customerService.getParticularCustomer(customerSSN);
    }
    @PUT
    @Path("/{customerSSN}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String changeAddress(@PathParam("customerSSN")String customerSSN,String address){

        return customerService.updateAddress(customerSSN,address);
    }

   @Path("/{customerSSN}/orders")
    public OrderResources getOrderResource(){
        return new OrderResources();
    }








}
