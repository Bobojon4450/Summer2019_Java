package day35_Constructors_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {

	
	/* 1. write a return method that accepts an int array and returns it as an ArrayList
       2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
       3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
       4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
       5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD	*/
	 
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double[] y = { 1.5, 2.9, 3.0, 4.5, 5.8, 6.9, 7.7, 8.1, 9.3 };
//		Integer[] Int = { 123, 5, 34, 765, 743, 78, 445, 6788, 9994, 23, 896 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(123, 5, 34, 765, 743, 78, 445, 5, 6788, 9994, 23, 896,9994));
		ArrayList<Integer>list2 = arrayToArrayList(x);
		
		System.out.println(arrayToArrayList(x));
		System.out.println(arrayToArrayList(y));
		System.out.println(maxNumber(list));
		System.out.println(secondMaxNumber(list));
		System.out.println(thirdMaxNumber(list));
		System.out.println(minimumNumber(list2));
		System.out.println(secondMinimumNumber(list2));
		
		ArrayList<Integer> listtt = new ArrayList<>();
		int aa = 1;
		System.out.println(listtt.remove(aa));
	}
	
	/*	We can't use Arrays.asList(), since list supports class only. No primitives allowed */
	public static ArrayList<Integer> arrayToArrayList(int [] arr){
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int each : arr) {
			list.add(each);// auto-boxing.
		}
		return list;
	}
	
	/* converts array and returns ArrayList */
	public static ArrayList<Double> arrayToArrayList(double [] arr){
		ArrayList<Double>list = new ArrayList<Double>();
		for (double each : arr) {
			list.add(each);// auto-boxing.
		}
		return list;
	}
	
	/* returns the maximum number form the list */
	public static int maxNumber(ArrayList<Integer>list) {
		int max = Integer.MIN_VALUE;
		for (Integer each : list) {
			if (each > max) {
				max = each;
			}
		}
		return max;
	}

	/* returns the second maximum number form the list */
	public static int secondMaxNumber(ArrayList<Integer>list) {
		Integer max = maxNumber(list); //returns max num;
		list.removeAll(Arrays.asList(max));//removes all max object from list. removeAll() 
										   //gets interface object. Our max is an Object.
		int secondMax = maxNumber(list);
		return secondMax;
	}

	/* returns the third maximum number form the list */
	public static int thirdMaxNumber(ArrayList<Integer>list) {
		Integer max = maxNumber(list); //returns max num;
		Integer secMax = secondMaxNumber(list);
		list.removeAll(Arrays.asList(max));//removes all max object from list. removeAll() 
										   //gets interface object. Our max is an Object.
		list.removeAll(Arrays.asList(secMax));
		int thirdMax = maxNumber(list);
		return thirdMax;
	}
		
	/*	Accepts an Integer ArrayList and returns the minimum number	*/
	public static int minimumNumber (ArrayList<Integer>list) {
		int min = Integer.MAX_VALUE;
		for (int each : list) {
			if (each < min) {
				min = each;
			}
		}
		return min;
	}

	/*	accepts an Integer arrayList and returns the second minimum number	*/
	public static int secondMinimumNumber(ArrayList<Integer>list) {
		Integer firstMin = minimumNumber(list);
		list.removeAll(Arrays.asList(firstMin));list.remove(firstMin);
		return minimumNumber(list);
		
	}
	
	
	
}
