package com.example.Restaurant.Repositry;

import com.example.Restaurant.model.MenuItems;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<MenuItems, String> {
}
