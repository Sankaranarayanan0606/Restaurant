package com.example.Restaurant.controller;

import com.example.Restaurant.Service.MenuService;
import com.example.Restaurant.model.MenuItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuItems> getMenu() {
        return menuService.getAllMenuItems();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  MenuItems createMenu(@RequestBody MenuItems menuItems)
    {
        return menuService.addMenuItem(menuItems);
    }


}
