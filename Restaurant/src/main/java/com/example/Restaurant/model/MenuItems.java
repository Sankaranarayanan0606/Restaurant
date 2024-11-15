package com.example.Restaurant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "Food")
@TypeAlias("Food")
@Component
public class MenuItems {
    @Id
    private String id;
    private String id1;
    private  String food_name;
    private int price;
    private  boolean isAvailable;

    public MenuItems() {
    }


    public MenuItems(String food_name, String id,String id1,  boolean isAvailable, int price) {
        this.food_name = food_name;
        this.id = id;
        this.id1 = id1;
        this.isAvailable = isAvailable;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getFoodName() {
        return food_name;
    }

    public void setFoodName(String food_name) {
        this.food_name = food_name;
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
