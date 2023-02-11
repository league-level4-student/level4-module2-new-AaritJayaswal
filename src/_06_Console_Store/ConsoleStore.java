package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		Cart<Food> cart = new Cart<Food>();

		double money = 15;
		String action;
		do {
		Scanner scan = new Scanner(System.in);

		
		
		System.out.println("Would you like to buy, view your cart, remove items, or pay? (buy, view, remove, pay)");

		action = scan.nextLine();

		
		
		if (action.equals("buy")) {

			if (money > 0) {

				String buy;

				System.out.println("What would you like to buy? (candy, cereal, milk, icecream)");

				buy = scan.nextLine();

				if (buy.equals("candy")) {
					if (money >= Candy.price()) {
						cart.add(new Candy());
						money = money - Candy.price();
					} else {
						System.out.println("You do not have enough money to buy this item!");
					}
				} else if (buy.equals("cereal")) {
					if (money >= Cereal.price()) {
						cart.add(new Cereal());
						money = money - Cereal.price();
					} else {
						System.out.println("You do not have enough money to buy this item!");
					}
				} else if (buy.equals("milk")) {
					if (money >= Milk.price()) {
						cart.add(new Milk());
						money = money - Milk.price();
					} else {
						System.out.println("You do not have enough money to buy this item!");
					}
				} else if (buy.equals("icecream")) {
					if (money >= IceCream.price()) {
						cart.add(new IceCream());
						money = money - IceCream.price();
					} else {
						System.out.println("You do not have enough money to buy this item!");
					}
				} else {

					System.out.println("Sorry, we don't have that here!");
				}

			}

			else {
				System.out.println("You are out of money!");
			}

		}
		
		else if(action.equals("remove")) {
			
			String remove;
			
			System.out.println("Which item would you like to remove? (candy, cereal, milk, icecream)");
			
			remove = scan.nextLine();
			
			if(remove.equals("candy")) {
				cart.remove(new Candy());
				money = money+Candy.price();
				
			}
			
			else if(remove.equals("cereal")) {
				cart.remove(new Cereal());
				money = money+Cereal.price();
			}
			else if(remove.equals("milk")) {
				
				cart.remove(new Milk());
				money = money+Milk.price();
			}
			else if(remove.equals("icecream")) {
				
				cart.remove(new IceCream());
				money = money+IceCream.price();
			}
			else {
				System.out.println("We don't sell that item here!");
			}
			
		}

		else if(action.equals("view")) {
			cart.showCart();
			
		}
		}
		
		while(action!="pay");
	
			
			System.out.println("Thank you for shopping with us! Your current balance is: $"+money);
		
		
	}

}
