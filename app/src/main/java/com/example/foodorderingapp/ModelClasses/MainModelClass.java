package com.example.foodorderingapp.ModelClasses;

public class MainModelClass {

    int image;
    String price,description,Title;

    public MainModelClass(int image, String price, String description, String title) {
        this.image = image;
        this.price = price;
        this.description = description;
        Title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

