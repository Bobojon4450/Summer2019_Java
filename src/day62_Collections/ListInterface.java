package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		System.out.println("---------------The List<E> Interface---------------\n");
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();/*	Doubly linked	*/
		List<Double> list3 = new Vector<>();
		List<String>list4 = new Stack<String>();// Stack is extended the Vector.
		
		/*	Concrete, implements List<E>, indexed, ordered, not sorted, duplicates allowed	*/
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.remove(1);
		System.out.println("ArrayList:\t"+intList);
		System.out.println("----------------------------------------------------\n");
		
		/*	Concrete, Implements List<E>. Objects are doubly linked and is slow in search and retrieving the data.
		 *  indexed, ordered, not sorted, duplicates allowed		*/
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		linkList.add(12); //has same methods as an ArrayList.
		linkList.add(22);
		linkList.add(22);
		linkList.add(22);
		linkList.add(2);
		linkList.add(32);
		linkList.remove(1); /* removing in linkedList is fast	*/
		System.out.println("(C)LinkedList:\t"+linkList);
		System.out.println("----------------------------------------------------\n");
		
		/*	(C), (I). Indexed, ordered, not sorted, duplicates allowed */
		String arr[] = {"A","B","B"};
		List<String>intList2 = new ArrayList<>(Arrays.asList(arr));
		LinkedList<String>linked = new LinkedList<String>(Arrays.asList(arr));
		System.out.println("(C)LinkedList:\t"+linked);//	[A, B, B]
		System.out.println("(I)List:\t"+intList2);//	[A, B, B]
		System.out.println("----------------------------------------------------\n");

		/* Concrete, Implements List<E>. Vector is synchronized/thread safe and thus is secure 
		 * and slow in performance. Indexed, ordered, not sorted, duplicates allowed */
		Vector<Integer>vector = new Vector<Integer>();
		vector.add(10);
		vector.add(10);
		vector.add(1);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.remove(vector.size()-1);
		System.out.println("(C)Vector:\t"+vector);
		System.out.println("----------------------------------------------------\n");
		
		/*	Stack is synchronized; Extends Vector.	Last-In-First-Out	-> LIFO	
		    Indexed, ordered, not sorted, duplicates allowed	*/
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(110);
		stack.add(110);
		stack.add(11);
		stack.push(112);
		stack.add(111);
		System.out.println("stack.pop():\t"+stack.pop()); /* pops the last added object and removes it instantly. */
		System.out.println("(C)Stack:\t"+stack);
		System.out.println(stack.get(0));
		System.out.print("----------------------------------------------------");
	}
}
