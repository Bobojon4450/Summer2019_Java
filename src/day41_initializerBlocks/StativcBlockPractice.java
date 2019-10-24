package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;


public class StativcBlockPractice {

	public static String name;
	public static int [] arr;
	static ArrayList<String>list = new ArrayList<String>();
	static ArrayList<String>students = new ArrayList<String>();
	static String[] online = {"Bahadir","Ibrahim", "Holly","Nurzat"};
	static String[] inClass = {"Daryna","Nadire", "Olha","Den"};
	int x;
	
	static { name = "Suna"; 
	         arr = new int [5];
	         list.add("Amin");
	         //  x =0; x is an instance variable.
	}
	
	
	static {for (int i = 0; i < arr.length; i++) {
		arr[i] = i*2;
	}}
	
	
	static {arr = new int [3]; arr[1] = 2;}
	
	static {name = "Adamsho"; students.addAll(Arrays.asList(online));}
	
	static {list.add("Arzigul");list.add("Spike"); students.addAll(Arrays.asList(inClass));}
	
	
	
	public StativcBlockPractice() {this.name = "Renamed";}
	
	public static void main(String[] args) {
		System.out.println(name);
		StativcBlockPractice sp = new StativcBlockPractice();
		System.out.println(name);
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.err.println(students);
	}
}
