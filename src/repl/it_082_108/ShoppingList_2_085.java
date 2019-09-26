package repl.it_082_108;
import java.util.Scanner;
	
	/*
	   In this assignment, you will write a program that will generate a shopping list. 
	   It's more advanced version of assignment #22 (Shopping list I).
	   Your program should ask use to enter items followed by its price. 
	   After adding item,  ask user if he wants to add one more item. If so, 
	   repeat previous steps again. If no, print shopping list report and total price 
	   as show in examples. Your program should accept up to 10 items. 
	   Hint: use do while loop.
	 */

public class ShoppingList_2_085 {

	public static void main(String[] args) {

		int count = 0;
		Scanner in = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		double totalPrice = 0;

		do {
			count++;
			if (count <= 10) {
				System.out.println("Enter Item" + count + " and its price:");
				item = in.next();
				price = in.nextDouble();
				totalPrice += price;
				shoppingListReport += item + " " + price + " ";
				System.out.println("Add one more item? Yes/No");
				countinue = in.next();
			} else {
				System.out.println("Can't take more then ten items at a time!");
				break;
			}
		} while (countinue.equalsIgnoreCase("yes") || countinue.equalsIgnoreCase("y"));

		String shopList[] = shoppingListReport.split(" ");
		
		int itemCount = 1;
		String finalOutput = "";
		for (int i = 0; i < shopList.length - 1; i += 2) {
			for (int j = i + 1; j < i + 2; j++) {
				finalOutput += "Item" + itemCount + ": " + shopList[i] + " " + "Price: " + shopList[j] + ", ";
				itemCount++;
			}
		}
		System.out.println(finalOutput.substring(0, finalOutput.length() - 2));
		System.out.println("Total price: "+totalPrice);

	}
}
