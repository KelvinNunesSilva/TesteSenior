package com.teste.Senior;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.MenuController;

@SpringBootApplication
public class SeniorApplication {

	public static void main(String[] args) {
		
			MenuController menu = new MenuController();
			menu.Menu();
		
		}
}
