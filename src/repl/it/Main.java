package repl.it;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Q#22
		String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;
	    
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter Item1 and its price:");
	    item1 = in.next();
	    price1 = in.nextDouble();

	    System.out.println("Enter Item2 and its price:");
	    item2 = in.next();
	    price2 = in.nextDouble();
	    
	    System.out.println("Enter Item3 and its price:");
	    item3 = in.next();
	    price3 = in.nextDouble();
	    
	    totalPrice = price1 + price2 + price3;
	    
	    
	    report = "Item1: "+item1+" Price: "+ price1+", Item2: "+item2+" Price: "+ price2+", Item3: "+item3+" Price: "+ price3;
	    
	    System.out.println(report);
	    System.out.println("Total price: "+totalPrice);

	}

}
