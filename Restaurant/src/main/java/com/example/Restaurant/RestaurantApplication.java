package com.example.Restaurant;

import com.example.Restaurant.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

@SpringBootApplication
public class RestaurantApplication {





	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
		MenuService menuService = new MenuService();


		System.out.println("Hello");
		System.out.println("veg food");
		System.out.println("non-veg food");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for veg food");
		System.out.println("Enter 2 for non veg food");
		System.out.println("Enter the number : ");

		int num = sc.nextInt();
		if(num <0 || num >2)
			System.out.println("PLEASE ENTER THE CORRECT NUMBER !!!...");


	}


}
