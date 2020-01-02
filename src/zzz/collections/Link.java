package zzz.collections;

import java.util.LinkedList;
import java.util.List;

public class Link {
	public static void main(String[] args) {
		String str[] = { "apples", "noobs", "pwnge", "bacon", "goats" };
		List<String> list = new LinkedList<String>();
		for (String each : str) {
			list.add(each);
		}

		String str2[] = { "sausages", "bacon", "harry", "Mary", "terry" };
		List<String> list2 = new LinkedList<String>();
		for (String each : str2) {
			list2.add(each);
		}
		
		list.addAll(list2);
		
	}

}
