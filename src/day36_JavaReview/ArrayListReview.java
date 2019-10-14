package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
        // add(object): takes an object
        list.add( 10 );   //Autoboxing
        list.add( 20 );
        
        //add(index, object): it will insert the given object at the given index number
        list.add(1, 30);
        
    //  list.add(4, 40);  // arrayList' size is dynamic. we cannot skip indexes
        list.add(3, 50);
        
    System.out.println(list);
    
// get(index number): returns the object at the given index
        //50:
    System.out.println( list.get(3) );
    
        //30:
    System.out.println(list.get(1) );
    
    
// size(): returns the total number of elements in the list ( similar with lenght method in array
    
    	System.out.println( list.size() ); //4 
     
    	// last index number: list.size()-1
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
    
    
// clear(): removes all object from arrayList, size will be 0
    list.clear();
    System.out.println(list);
    
    
// set(0, Object): replaces the index with the given object
		ArrayList<String> students = new ArrayList<>();
		students.add("Erhan");
		students.add("Homayra");
		students.add("Rahwa");
		students.add("Arzu");
		students.add("Mehmet");
		students.add("Rahwa");

		System.out.println(students);

		students.set(0, "Holly");
		System.out.println(students);

		students.set(4, "Happy birthday Mehmed");
		System.out.println(students);
    
            
// indexOf(Object): retrun's the first matching object's index number
        System.out.println( students.indexOf("Rahwa") ); //2
    
// lastIndexOf(Object): returns the last matching object's index number
        System.out.println(students.lastIndexOf("Rahwa"));  //5
        
        
// equals(): checks the objects in two arrayLIST AND RETURNS BOOLEAN EXPRESSION
		ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A", "B", "C"));

		System.out.println(students.equals(students2));// false

		students2 = students;

		System.out.println(students.equals(students2)); // true
    
        
// contains(Object): checks if the given object is contained in the arraylist or not, and returns boolean expression
        
        System.out.println(students);
        
        System.out.println(students.contains("Muhtar"));  // false
        
        System.out.println(students.contains("Rahwa"));  // true
        System.out.println(students.contains("Erhan"));  // false
        
        
/*	isEmpty(): checks if the size of the arrayList is 0 or not	*/
        ArrayList<Character>ch = new ArrayList<>();
        System.out.println(ch.isEmpty());		//	false
        
        
/*	remove(primitive): removes the index number */
		ArrayList<Integer> price = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(price);
		price.remove(0);
        System.out.println(price);
        
        /*	remove() is not designed to be used in the loop.	It is not going to work properly! */
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 5, 6, 7, 8, 1));
        for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == 1) {
				nums.remove(i);
			}
		}
        System.out.println(nums);
        
        /*	This may be solved as follows: removeAll(Interface) */
        nums.removeAll(Arrays.asList(1));
        System.out.println(nums+"\n"); //nums.removeAll(Arrays.asList(nums.get(i))); in the loop
        
/*	addAll(Interface): adds multiple objects to the ArrayList		*/
        
        ArrayList<String>n1 = new ArrayList<String>();
        n1.addAll(Arrays.asList("Yasin","Talha", "Ruslan"));
        System.out.println(n1+"\n");
        
/*	Collections.sort()	sorts the arrayList in ascending order.		*/
		Integer[] arr = { 1, 2, 3, 5, 76, 89, -89, -4, -2, 23 };
		ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list6);
		Collections.sort(list6);
		System.out.println(list6+"\n");
		
		
/*	remove(Object): removes the first matching object from the ArrayList	*/
		 ArrayList<String>list7 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
		 System.out.println(list7);
		 list7.remove("D");
		 System.out.println(list7);
        
        
        
        
	}
}



