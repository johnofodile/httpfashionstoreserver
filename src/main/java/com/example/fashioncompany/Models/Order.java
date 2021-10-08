package com.example.fashioncompany.Models;

public class Order {
    private int orderId;
    private String dateOfOrder;
    private int price;
    private String paymentStatus;
public Order(int orderId,String dateOfOrder,int price,String paymentStatus){
    this.orderId=orderId;
    this.dateOfOrder=dateOfOrder;
    this.price=price;
    this.paymentStatus=paymentStatus;
}

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public int getOrderId(){
    return orderId;
    }



}
