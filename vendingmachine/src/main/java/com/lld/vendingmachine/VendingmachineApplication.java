package com.lld.vendingmachine;


import Inventory.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vendingmachine.VendingMachine;

@SpringBootApplication
public class VendingmachineApplication {


	public static void main(String[] args) {

		SpringApplication.run(VendingmachineApplication.class, args);

		// Creating VendingMachine object
		VendingMachine vendingMachine = new VendingMachine();

		// Adding Product "hersheys"
		Product hersheys = new Product("hersheys", 1, 5.0);
		for (int i = 1; i <= 3; i++) {
			vendingMachine.addProduct(hersheys);
		}

		// Adding Product "biskfarm"
		Product biskfarm = new Product("biskfarm", 2, 2.0);
		for (int i = 1; i <= 3; i++) {
			vendingMachine.addProduct(biskfarm);
		}

		// Performing Vending Machine Operations
		vendingMachine.insertCoin(5.0);
		vendingMachine.insertCoin(3.0);
		vendingMachine.pressButton(1);

		vendingMachine.insertCoin(5.0);
		vendingMachine.pressButton(1);

		vendingMachine.insertCoin(7.0);
		vendingMachine.pressButton(2);
	}

}
