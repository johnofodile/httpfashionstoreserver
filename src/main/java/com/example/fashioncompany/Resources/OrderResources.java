package com.example.fashioncompany.Resources;

import com.example.fashioncompany.Models.Order;
import com.example.fashioncompany.Services.OrderServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResources {
    OrderServices orderServices = new OrderServices();

    @GET
    public List<Order> getOrders(@PathParam("customerSSN") String customerSSN) {
        return orderServices.getOrders(customerSSN);
    }
    @GET
    @Path("/{orderID}")
    public Order getOrder(@PathParam("customerSSN")String customerSSN,@PathParam("orderID")int orderID){
        return orderServices.getOrder(customerSSN,orderID);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Order addOrder(@PathParam("customerSSN")String customerSSN,Order order){
        return orderServices.addOrder(customerSSN,order);
    }

}

