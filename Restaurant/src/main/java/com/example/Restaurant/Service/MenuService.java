package com.example.Restaurant.Service;
import org.springframework.stereotype.Component;
import com.example.Restaurant.Repositry.MenuRepository;
import com.example.Restaurant.model.MenuItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;

    public MenuItems addMenuItem(MenuItems menuItems){
        return menuRepository.save(menuItems);

    }
    public MenuItems updateMenuItem(String id, MenuItems menuItems) {
        if (menuRepository.existsById(id)) {
            menuItems.setId(id);
            return menuRepository.save(menuItems);
        }
        return null;
    }

    public void deleteMenuItem(String id) {
        menuRepository.deleteById(id);
    }

    public List<MenuItems> getAllMenuItems() {    //Success

        return menuRepository.findAll();
    }
}
