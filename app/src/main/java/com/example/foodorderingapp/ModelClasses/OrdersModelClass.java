package com.example.foodorderingapp.ModelClasses;

public class OrdersModelClass {

    int image;
    String Orderprice,orderNumber,orderedFoodName;

    public OrdersModelClass(){}

    public OrdersModelClass(int image, String orderprice, String orderNumber, String orderedFoodName) {
        this.image = image;
        Orderprice = orderprice;
        this.orderNumber = orderNumber;
        this.orderedFoodName = orderedFoodName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getOrderprice() {
        return Orderprice;
    }

    public void setOrderprice(String orderprice) {
        Orderprice = orderprice;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrdersFoodName() {
        return orderedFoodName;
    }

    public void setOrdersFoodName(String ordersFoodName) {
        this.orderedFoodName = ordersFoodName;
    }
}
