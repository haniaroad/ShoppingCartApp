import java.util.ArrayList;
import java.util.*;

public class ShoppingApp {

		
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>(); // Menu item names
		ArrayList<Double> prices = new ArrayList<Double>();// Menu item prices

		ArrayList<String> orderNames = new ArrayList<String>(); // User order names
		ArrayList<Double> orderPrices = new ArrayList<Double>();// User order prices

		names.add("Nutella");
		names.add("Juice");
		names.add("Salad");
		names.add("Candy");
		names.add("Strawberries");

		prices.add(4.99); // Nutella
		prices.add(2.99); // Pancake Mix
		prices.add(5.99); // Salad
		prices.add(3.99); // Ice Cream
		prices.add(4.99); // Strawberries
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		String item = "Item"; // Word item displayed in menu
		String menuPrice = "Price"; // Word price displayed in menu
		String tryAgain = "";
		String userPick = "";
		double sum = 0;
		double avg = 0;
		
		
		System.out.println("Welcome to the Grand Circus Shopping App!\n");
		System.out.printf("%-15s", item);
		System.out.printf("%20s", menuPrice);
		System.out.println("\n===========================================");
		
		
	do {
		
		showMenu(names, prices);
		
			
		addToCart(userPick, scanner, orderNames, orderPrices);
		
	
		
		System.out.println("Would you like anything else? Y/N"); 
		tryAgain = scan.nextLine(); //Responsible for restarting the game
		
		
		} while(tryAgain.equalsIgnoreCase("Y"));
	
	
		if(tryAgain.equalsIgnoreCase("N")) {
			System.out.println("\nThanks for your order!");
			System.out.println("Here's what you got: ");
			
		}
	
			for(int i = 0; i< orderNames.size(); i++) {
				
				System.out.printf("\n%-30s", orderNames.get(i));
				
			}
	
			for(int j=0; j < orderPrices.size(); j++) {
				System.out.printf("\n%15s", orderPrices.get(j));
			}
			
			for(int k = 0; k < orderPrices.size(); k++) {
				
				sum += orderPrices.get(k);
				
				
			}
			
			avg = sum / orderPrices.size();
			
			System.out.println("Your total was: " + sum);
			System.out.println("Your average price per item was: " + avg);
	
	}

	public static void showMenu(ArrayList<String> n, ArrayList<Double> p) {
			
		
		for (int i = 0; i < n.size(); i++) { // Display Menu Items
			System.out.printf("%-30s %-30s\n", n.get(i), p.get(i));
		}
	
	
	}

	public static void addToCart(String itemTyped, Scanner scan, ArrayList<String> orderNames, ArrayList<Double> orderPrices) {

		itemTyped = Validator.getString(scan, "\nWhat item would you like to order?");

		if (itemTyped.contains("Nutella")) {
			orderNames.add("Nutella");
			orderPrices.add(4.99);
			System.out.println("Added to your cart!\n");
			
			
		}

		else if (itemTyped.contains("Juice")) {
			orderNames.add("Juice");
			orderPrices.add(2.99);
			System.out.println("Added to your cart!\n");
			
		}

		else if (itemTyped.contains("Salad")) {
			orderNames.add("Salad");
			orderPrices.add(5.99);
			System.out.println("Added to your cart!\n");
			
		} 
		
		else if (itemTyped.contains("Candy")) {
			orderNames.add("Candy");
			orderPrices.add(3.99);
			System.out.println("Added to your cart!\n");
			
		}

		else if (itemTyped.contains("Strawberries")) {
			orderNames.add("Strawberries");
			orderPrices.add(4.99);
			System.out.println("Added to your cart!\n");
			
		}

		else {
			System.out.println("Sorry, we don't carry that! Pick again? Y/N");
			
		}
		
		
	}
	
}
