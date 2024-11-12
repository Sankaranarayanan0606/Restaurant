package com.example.Restaurant.Service;
import org.springframework.stereotype.Component;
import com.example.Restaurant.Repositry.MenuRepository;
import com.example.Restaurant.model.MenuItems;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuService {
    @Autowired
    MenuRepository menuRepository;

    public MenuItems addMenuItem(MenuItems menuItems){
        return menuRepository.save(menuItems);

    }
    public MenuItems updateMenuItem(int id, MenuItems menuItems) {
        if (menuRepository.existsById(id)) {
            menuItems.setId(id);
            return menuRepository.save(menuItems);
        }
        return null;
    }

    public void deleteMenuItem(int id) {
        menuRepository.deleteById(id);
    }
}
