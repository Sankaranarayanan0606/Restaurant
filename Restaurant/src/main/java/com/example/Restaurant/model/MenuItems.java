package com.example.Restaurant.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "menu")
@Component
public class MenuItems {
    @id
    private int id;
    private  String foodName;
    private int price;
    private  boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
