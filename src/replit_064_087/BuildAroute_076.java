package replit_064_087;
import java.util.Scanner;

public class BuildAroute_076 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first letter from A-D(A,B,C,D) ");
		String start = in.next();
		System.out.println("Enter second letter from A-D(A,B,C,D) ");
		String end = in.next();
		
		if(start.equalsIgnoreCase("a") && end.equalsIgnoreCase("b")) {
			System.out.println("right: "+end+" found");
		}else if(start.equalsIgnoreCase("a") && end.equalsIgnoreCase("c")) {
			System.out.println("right > down: "+end+" found");
		}else if(start.equalsIgnoreCase("a") && end.equalsIgnoreCase("d")) {
			System.out.println("right > down > left: "+end+" found");
		}else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("a")) {
			System.out.println("down > left > up: "+end+" found");
		}else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("c")) {
			System.out.println("down: "+end+" found");
		}else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")) {
			System.out.println("down > left: "+end+" found");
		}else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")) {
			System.out.println("left > up: "+end+" found");
		}else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")) {
			System.out.println("left > up > right: "+end+" found");
		}else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")) {
			System.out.println("left: "+end+" found");
		}else if(start.equalsIgnoreCase("d") && end.equalsIgnoreCase("a")) {
			System.out.println("up: "+end+" found");
		}else if(start.equalsIgnoreCase("d") && end.equalsIgnoreCase("b")) {
			System.out.println("up > right: "+end+" found");
		}else if(start.equalsIgnoreCase("d") && end.equalsIgnoreCase("c")) {
			System.out.println("up > right > down: "+end+" found");
		}else {
			System.out.println(start+" found");
		}

	}
}
