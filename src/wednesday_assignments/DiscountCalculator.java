package wednesday_assignments;
import java.util.Scanner;
public class DiscountCalculator {
	
	static Scanner in;
	
	public static void discountEvaluator() {
		in = new Scanner(System.in);
		double totalAmount = 0;
		double discount = 0;
		double sum = 0;
		double price;
		int quantiti;
		System.out.println("Enter unit price: ");
		price = in.nextDouble();
		System.out.println("Enter quantity: ");
		quantiti = in.nextInt();
		
		if (quantiti >= 100 && quantiti <= 120) {
			sum = (price * quantiti);
			discount = (sum * 10) / 100;
			totalAmount = sum - discount;
			System.out.println("Grand total: "+ sum);
			System.out.println("Discount: "+10+"%");
			System.out.println("Discount applied: $ "+discount);
			System.out.println("Total: $ "+totalAmount);
		}else if (quantiti > 120) {
			sum = (price * quantiti);
			discount = (sum * 15) / 100;
			totalAmount = sum - discount;
			System.out.println("Grand total: "+ sum);
			System.out.println("Discount: "+15+"%");
			System.out.println("Discount applied: $ "+discount);
			System.out.println("Total: $ "+totalAmount);
		}else if(quantiti < 100 && quantiti > 0){
			sum = (price * quantiti);
			System.out.println("No discount applied!");
			System.out.println("Total amount is: $ "+sum);
		}else {
			System.out.println("Invalid input!");
		}	
	}
	
	public static void main(String[] args) {
		discountEvaluator();	
	}
	
	
	
	
	
}
