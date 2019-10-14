package day35_Constructors_continue;

import java.util.ArrayList;

public class Quiz_9 {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer x = 1;
		list.remove(x);// it removes object when object is passed instead of index.
		System.out.println(list);

		ArrayList<String>list2 = new ArrayList<>();
		list2.add("Robb");
		list2.add("Bran");
		list2.add("Michael");
		list2.add("Bran");
		if (list2.remove("Bran")) { 	//	here Bran removed
			list2.remove("John");	//	John not exist and nothing returned.
		}
		System.out.println(list2);	//	[Robb, Michael, Bran]
		
		
	}
}
