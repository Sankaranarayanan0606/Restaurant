package com.example.Restaurant.Repositry;

import com.example.Restaurant.model.MenuItems;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<MenuItems, Integer> {
}
