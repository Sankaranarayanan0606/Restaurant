package com.example.Restaurant;

import com.example.Restaurant.Service.MenuService;
import com.example.Restaurant.model.MenuItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


import java.util.Scanner;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
		MenuService menuService = new MenuService();


//		System.out.println("Hello");
//		System.out.println("veg food");
//		System.out.println("non-veg food");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1 for veg food");
//		System.out.println("Enter 2 for non veg food");
//		System.out.println("Enter the number : ");
//
//		int num = sc.nextInt();
//		if(num <0 || num >2)
//			System.out.println("PLEASE ENTER THE CORRECT NUMBER !!!...");
//
//			menuService.mess();

//		for (MenuItems allMenuItem : menuService.getAllMenuItems()) {
//			allMenuItem.getId();
//			allMenuItem.getId1();
//			allMenuItem.getFoodName();
//			allMenuItem.getPrice();
//			allMenuItem.isAvailable();
//		}


	}


}

@Component
class RestaurantAppRunner implements CommandLineRunner {

	@Autowired
	private MenuService menuService;
	@Autowired
	private MenuItems menuItems;

	Scanner sc = new Scanner(System.in);
	@Override
	public void run(String... args) {
		System.out.println("Hello");
		System.out.println("PLEASE ENTER THE CORRECT NUMBER !!!...");
//		System.out.println("---------MENU----------");
//		System.out.println("S.NO  Food Name              Price          Available");
//		for (MenuItems allMenuItem : menuService.getAllMenuItems()) {
//			System.out.print(allMenuItem.getId() + ",");
//			System.out.print( + ",");
//			System.out.print(allMenuItem.getId1() +"     "+ allMenuItem.getFoodName() + "   ------ "+allMenuItem.getPrice() +"------->"+allMenuItem.isAvailable()+"\n");
//			System.out.print( + ",");
//			System.out.print(+"\n");
//	}

			String id1 = sc.nextLine();
			String food_name = sc.nextLine();
			int price = sc.nextInt();
			boolean available = sc.nextBoolean();
			new MenuItems(id1,food_name,id1,available,price);
//			menuItems.setId1(id1);
//			menuItems.setFoodName(food_name);
//			menuItems.setPrice(price);
//			menuItems.setAvailable(available);
			MenuItems saved = menuService.addMenuItem(menuItems);
			System.out.println(saved.getId() + "  Saved Successfully in the database");
	}


	public void updater(String... args){


	}
}