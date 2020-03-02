package day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		
	/*	Map<Key, Value>  map1 = new HashMap<>(); 		No duplicate keys 
		Map<Key, Value>  map2 = new LinkedHashMap<>();
		Map<Key, Value>  map3 = new HashTable<>();
		Map<Key, Value>  map1 = new TreeMap<>();	*/

		/* HashMap unordered, insertions are not maintained */
		Map<String, Double>employees = new HashMap<>();
		employees.put("Adam", 123011d);
		employees.put("Zuhal", 123456d);
		employees.put("Zamira", 111456d);
		double num = employees.get("Adam");
		System.out.println("Map (I) <-> HashMap (C) :\t"+employees);
		System.out.println("Adam's salary is $"+employees.get("Adam")+"\n");
		System.out.println("---------------------------------------------");
		
		employees.remove("Zamira"); // accepts key but deletes entire entry (k,v)
		System.out.println("Map (I) <-> (C) HashMap:\t"+employees);
		System.out.println("employees size: "+employees.size());
		System.out.println("---------------------------------------------");
		
		boolean b = employees.containsKey("Adam");
		System.out.println(b);
		
		boolean c = employees.containsValue("Adam");
		System.out.println(c);
		
		Set<String> set = employees.keySet(); // collects all keys and returns the collections keys
		System.out.println("keySet(): "+set);
		System.out.println("-----------------------------------------------");
		
		/* Keys must be unique and values can be duplicated,
		 * LinkedHashMap maintains the insertion ordered
		 * */
		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		map1.put("A", 100);
		map1.put("A", 10);
		map1.put("A", 6);
		map1.put("A", 2); //<-- this one will be assigned
		System.out.println("map1: "+map1);
		map1.put("B", 8);
		map1.put(null, null);
		System.out.println("map1: "+map1);
		System.out.println("-----------------------------------------------");
		
		/* HashTable Key and Value cannot be null. Synchronized */
		Hashtable<String, Integer> hash = new Hashtable<>();
//	    map2.put("A", null); // key cannot be null
	    System.out.println("Hashtable:\t"+hash);
	    
	    /* TreeMap is sorted data type. Sorts keys in ascending order, not values */
	    TreeMap<String, Integer> map3 = new TreeMap<>();
	    map3.put("Z", 1000);
	    map3.put("Y", 9000000);
	    map3.put("X", 1000000);
	    
	    for ( String map : map3.keySet()) {
			System.out.println(map);
		}
	    System.out.println("TreeMap:\t"+map3);
	}
	
}
