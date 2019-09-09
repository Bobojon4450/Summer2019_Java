package repl.it;
import java.util.Scanner;

public class ShoppingList_028 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    String item1, item2, item3, report ="";
	    double price1, price2, price3, totalPrice;
	    int count1, count2, count3;
	    
	    System.out.println("Enter Item1, count and its price:");
	    item1 = in.nextLine();
	    count1 = in.nextInt();
	    price1 = in.nextDouble();
	    in.nextLine();
	    
	    System.out.println("Enter Item2, count and its price:");
	    item2 = in.nextLine();
	    count2 = in.nextInt();
	    price2 = in.nextDouble();
	    in.nextLine();
	    
	    System.out.println("Enter Item3, count and its price:");
	    item3 = in.nextLine();
	    count3 = in.nextInt();
	    price3 = in.nextDouble();
	    in.nextLine();
	    
	    totalPrice = (price1*count1) + (price2*count2) + (price3*count3);
	    
		if (count1 > 0) {
			report = "Item1: " + item1 + " Price: " + (price1 * count1) + ", ";
		}
		if (count2 > 0 && count3 > 0) {
			report += "Item2: " + item2 + " Price: " + (price2 * count2) + ", ";
		}
		if (count2 > 0 && count3 == 0) {
			report += "Item2: " + item2 + " Price: " + (price2 * count2);
		}
		if (count3 > 0) {
			report += "Item3: " + item3 + " Price: " + (price3 * count3);
		}
	    if(count1 == 0 && count2 == 0 && count3 == 0) {
	    	report = "The shopping cart is empty!";
	    }
	    System.out.println(report);
	    System.out.println("Total price: "+totalPrice);

	}

}
/*Shoes
1
50.0
Shirt
2
30.0*/