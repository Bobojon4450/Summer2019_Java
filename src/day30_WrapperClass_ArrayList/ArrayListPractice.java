package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Homayra");
		list.add("Apple");
		list.add(1, "Adamsho");
		System.out.println("list: "+list);
		System.out.println("----------------------------------------");

		Scanner in = new Scanner(System.in);
		ArrayList<String> studentName = new ArrayList<>();

		while (true) {
			System.out.println("Enter name: ");
			String name = in.nextLine();
			studentName.add(name);

			System.out.println("Do you want to enter another name?");
			String respond = in.nextLine().toLowerCase();
			if (!(respond.equals("yes") || respond.equals("no") || respond.equals("n") || respond.equals("y"))) {
				System.out.println("Invalid");
				break;
			}
			if (respond.equalsIgnoreCase("No") || respond.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println(studentName);
		System.out.println("----------------------------------------");
		
		
		int c[] = new int[] { 1, 2, 3, 4, 5 };
		int d[] = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			d[i] = c[i] * 2;
		}
		System.out.println("c[]: "+Arrays.toString(c));
		System.out.println("d[]: "+Arrays.toString(d));
	}
}
