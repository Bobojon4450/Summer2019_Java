package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		/* Helps to create own expressions */
//						    name	  key -> represents our Predicate. (p == 100) is boolean condition
		Predicate<Integer> remove100 = p -> p == 100;
//		Whenever we declare Predicate the Iterator is automatically applied.
		
		
		/* The only legit way of removing elements is to use Iterator()
		 * 
		 * In the Collections framework data structures all Interfaces have method called removeIf();
		 */
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(100, 100, 1000, 100, 10, 11, 101));
		System.out.println("list:\t" + list);
		list.removeIf(remove100);
		System.out.println("list:\t" + list);
		System.out.println("-------------------------------------------------");
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600));
		list2.removeIf(L -> L > 300); // represents lambda expression
		System.out.println(list2);
		System.out.println("-------------------------------------------------");
		
		
		/* forEach() loop*/
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		list3.forEach(each -> {
			if (each < 5)
				System.out.print(each+" ");
		});
		System.out.println("\n-------------------------------------------------");
		
		
		/* Another way of looping and printing elements */
		list3.forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		
		
		List<String>names = new ArrayList<String>(Arrays.asList("Amad","Ibrohim","Mahmut","Aziz","Amina","Mehemet"));
		System.out.println("names:\t"+names);
		Predicate<String> nameRemove = q -> q.endsWith("t");
		names.removeIf(nameRemove);
		System.out.println("names:\t"+names);
		System.out.println("-------------------------------------------------");
		
		
		List<String> L1 = new ArrayList<String>();
		L1.addAll(Arrays.asList("Muhtar", "Marufjon", "Mahmut", "Aziz", "Amina", "Mehemet"));
		System.out.println("L1: "+L1);

		List<String> L2 = new ArrayList<String>();
		L1.forEach(each -> {
			if (each.startsWith("M")) {
				L2.add(each);
			}
		});
		System.out.println("L2: " + L2);

		L1.removeIf(M -> M.startsWith("M"));
		System.out.println("L1: " + L1);
	}
}
