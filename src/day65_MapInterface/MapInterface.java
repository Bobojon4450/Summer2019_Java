package day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		
	/*	Map<Key, Value>  map1 = new HashMap<>();
		Map<Key, Value>  map2 = new LinkedHashMap<>();
		Map<Key, Value>  map3 = new HashTable<>();
		Map<Key, Value>  map1 = new TreeMap<>();	*/

		/* HashMap is unordered */
		Map<String, Double>employees = new HashMap<>();
		employees.put("Adam", 123011d);
		employees.put("Zuhal", 123456d);
		employees.put("Zamira", 111456d);
		double num = employees.get("Adam");
		System.out.println("(I) Map <-> (C) HashMap:\t"+employees);
		System.out.println("Adam's salary is $"+employees.get("Adam"));
		
		employees.remove("Zamira");
		System.out.println("(I) Map <-> (C) HashMap:\t"+employees);
		System.out.println("employees size: "+employees.size());
		
		boolean b = employees.containsKey("Adam");
		System.out.println(b);
		
		boolean c = employees.containsValue("Adam");
		System.out.println(c);
		
		Set<String> set = employees.keySet();
		System.out.println(set);
		System.out.println("-----------------------------------------------");
		
		/* Keys must be unique and values can be duplicated,
		 * LinkedHashMap is ordered
		 * */
		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		map1.put("A", 100);
		map1.put("A", 10);
		map1.put("A", 6);
		map1.put("A", 2);
		System.out.println(map1);
		map1.put("B", 8);
		map1.put(null, null);
		System.out.println(map1);
		System.out.println("-----------------------------------------------");
		
		/* HashTable is a concrete class implementing the Map Interface */
		Hashtable<String, Integer> map2 = new Hashtable<>();
//	    map2.put("A", null);
	    System.out.println("Hashtable:\t"+map2);
	    
	    /* TreeMap is sorted data type. Sorts keys only, not values */
	    TreeMap<String, Integer> map3 = new TreeMap<>();
	    map3.put("Z", 1000);
	    map3.put("Y", 9000000);
	    map3.put("X", 1000000);
	    
	    System.out.println("TreeMap:\t"+map3);
	}
	
}
