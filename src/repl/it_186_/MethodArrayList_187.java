package repl.it_186_;

import java.util.ArrayList;
import java.util.Arrays;




public class MethodArrayList_187 {
	
	/*	187. Methods with ArrayList 8 - CombineAll	*/
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		ArrayList<String>list = wordList1;
		for (String each : wordList2) {
			list.add(each);
		}
		return list;
	}
	
	/*	188. Methods with ArrayList 9 - removeAll	*/
	public static void removeAll(ArrayList<String>wordList, String target) {
		wordList.removeAll(Arrays.asList(target));
	}
	
	/*	189. Methods with String 13 - find error string	*/
	public static boolean isError(String str) {
		boolean temp = false;
		if (str.startsWith("error")) {
			temp = true;
			return temp;
		}else{
			return temp;
		}
	}
	
	/*	192. Methods with ArrayList 10 - timesTwo	*/
	public static void timesTwo(ArrayList<Integer>nums) {
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, (nums.get(i)*2));
		}
	}
	
	/* 	Methods with Arrays 1 - add Elements	*/
	public static int[] addElements(int[] ints1, int[] ints2) {
		int [] temp = new int [ints1.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (ints1[i] + ints2[i]);
		}
		return temp;
	}
	
	
	/* 	Methods with Arrays 1 - delete element	*/
	public static int[] deleteR(int[] arr,int element) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		list.removeAll(Arrays.asList(element));
		int [] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	
	
	/* getDup(["1","2","aa"',"1"])
	   returns:2 ("1" is duplicated and there are two "1"s so return is 2)

	   getDup(["1","2","aa"',"1", "aa"])
	   returns:4 ("1" is duplicated and there are two "1"s and 2 "aa"s so return is 4) */

	/* 	Methods with Arrays 3 - get duplicates	*/
	public static int getDup(String[] str) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		int result = 0;
		for (int j = 0; j < list.size()-1; j++) {
			String sentinel = list.get(j);
			int count = 1;
			for (int i = j+1; i < list.size(); i++) {
				if (sentinel.equals(list.get(i))) {
					count++;
				}
			}
			if (count > 1) {
				result += count;
				list.removeAll(Arrays.asList(list.get(j)));
			}
		}
		return result ; 
	}
	
	
	/* 	Methods with ArrayList - 2Times		*/
	public static ArrayList<Integer> twoTimes(ArrayList<Integer>list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer each : list) {
			newList.add(each);
			newList.add(each);
		}
		return newList;
	}
	
	
	/* 	195. Methods with String 15 - anagram	*/
	public static boolean isAnagram(String word1, String word2) {

		if (word1.length() == word2.length()) {
			for (int j = 0; j < word1.length(); j++) {
				int count1 = 0;
				int count2 = 0;
				String temp = word1.substring(j, (j + 1)); // l
				for (int i = 0; i < word1.length(); i++) {
					if (temp.equalsIgnoreCase(word1.substring(i, (i + 1)))) {
						temp = word1.substring(i, (i + 1));
						count1++;
					}
				}
				if (word2.contains(temp)) {
					for (int i = 0; i < word2.length(); i++) {
						String temp2 = word2.substring(i, (i + 1));
						if (temp2.equalsIgnoreCase(temp)) {
							count2++;
						}
					}
					if (count1 == count2) {
						continue;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	
	/* 	Arrays - Copy Certain values	*/
	public static String[] getWithE(String[] arr) {
		int count = 0;
		for (String str : arr) {
			if (str.contains("e")) {
				count++;
			}
		}
		String[] fewValue = new String[count];
		int sentinel = 0;
		for (String str : arr) {
			if (str.contains("e")) {
				fewValue[sentinel] = str;
				sentinel++;
			}
		}
		return fewValue;
	}
	
	
	
	
	/* 	155. Methods 17. Fibonacci numbers	*/
	public static void fib(int num) {
		ArrayList<Long>fibonacci = new ArrayList<>();
		fibonacci.add(0L);
		fibonacci.add(1L);
		for (int i = 2; i <= 91; i++) {
			fibonacci.add( (fibonacci.get(i-2))+(fibonacci.get(i-1)) );
		}
		if (num <= 1) {
			System.out.println(num);
		} else {
			System.out.println(fibonacci.get(num - 1) + fibonacci.get(num - 2));
		}
	}
	
	/* 	Methods with ArrayList- search	*/
	public static String search(ArrayList<String> r, String find) {
		for (String str : r) {
			if (str.contains(find)) {
				return str;
			}
		}return "search failed";
	}
	
	
	
	/* 	Methods with ArrayList - remove instances	*/
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
		ArrayList<Integer> list = r;
		list.removeAll(Arrays.asList(n));
		return list;
	}
	
	/* 	Methods with ArrayList - repeatAll returns arraylist object*/
	public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> bool) {
		ArrayList<Boolean> list = new ArrayList<>();
		for (int i = 0; i < bool.size(); i++) {
			list.add(bool.get(i));
		}
		for (Boolean boo : bool) {
			list.add(boo);
		}
		return list;
	}
	
	
	/* 	Methods with ArrayList - repeatAll_2	*/
	public static void repeatAL_2(ArrayList<Boolean> list){
	   int length = list.size();
	   for(int i=0; i<length; i++){
	      list.add(list.get(i));
	   }
	   System.out.println(list);
	}
	
	
	/* 	Methods with ArrayList - appendPosSum	*/
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer>list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int sum = 0;
		for (Integer intG : list) {
			if (intG > 0) {
				newList.add(intG);
			}
		}
		for (Integer intG : newList) {
			sum += intG;
		}
		newList.add(sum);
		return newList;
	}
	
	
	/* 	OOP 3 - getter/setter	*/
	public void insertData(String str, int x) {
		//	setData(str);
		//	setYint(x);
	}
	
	
	/* 	OOP 10 - static method	*/
	public static int plus(int x , int y) {
		return x + y;
	}
	
	public static int minus(int x , int y) {
		return x - y;
	}
	
	
	 
//	public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> bool) {
//		ArrayList<Boolean> list = new ArrayList<>();
//		for (int i = 0; i < bool.size(); i++) {
//			list.add(bool.get(i));
//		}
//		for (Boolean boo : bool) {
//			list.add(boo);
//		}
//		return list;
//	}
	
	
	
	
	
	
	/* 		*/
	/* 		*/
	/* 		*/
	/* 		*/
	/* 		*/
	/* 		*/
	/* 		*/
	/* 		*/
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list.add(""+i);
		}
		System.out.println(list+"\n");
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list2.add(""+(i*5));
		}
		System.out.println(list2);
		System.out.println("\n"+combineAL(list, list2));
		
		/*	188	*/
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("hi","By","say","hi","May","try","catch"));
		System.out.println(list3);
		removeAll(list3, "hi");
		System.out.println(list3+"\n");
		
		/*	189	*/
		System.out.println(isError("error one two"));
		
		/* 192 */
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(list4);
		timesTwo(list4);
		System.out.println("list4: --> "+list4);
		
		
		/* 	Methods with Arrays 1 - add Elements	*/
		int x [] = {10, 40, 50, 3, 1};
		int y [] = {11, 0, 500, 44, 1101};
		System.out.println(Arrays.toString(addElements(x, y))+"\n");
		
		/* 	Methods with Arrays 1 - delete element	*/
		System.out.println(Arrays.toString(deleteR(x, 10)));
		
		/* 	Methods with Arrays 3 - get duplicates	*/
		String[] str = { "1","2","aa","1" };
		System.out.println(getDup(str)+"\n");
		
		/* 	Methods with ArrayList - 2Times		*/
		System.out.println("list4: "+twoTimes(list4)+"\n");
		
		/* 	195. Methods with String 15 - anagram	*/
		String word1 = "sava";
		String word2 ="avsa";
		System.out.println(isAnagram(word1, word2)+"\n");
		
		/* 	Arrays - Copy Certain values	*/
		String [] arr = {"e", "hey", "bye", "furey", "spoon"};
		System.out.println(Arrays.toString(getWithE(arr))+"\n");
		
		/* 	155. Methods 17. Fibonacci numbers	*/
		fib(7);
		
		/* 	Methods with ArrayList- search	*/
		ArrayList<String> list5 = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
		System.out.println(search(list5, "four"));
		System.out.println();
		
		/* 	Methods with ArrayList - remove instances	*/
		ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(1,2,4,3,4,6,9,7,78,7,2));
		System.out.println(list6);
		System.out.println(removeInst(list6, 2));
		
		
		/* 	Methods with ArrayList - repeatAll	*/
		ArrayList<Boolean> test = new ArrayList<Boolean>(Arrays.asList(true, false, false));
		test = repeatAL(test);
		System.out.println(test+"\n");
		
		
		/* 	Methods with ArrayList - appendPosSum	*/
		ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(1,2,-4,3,4));
		System.out.println(list7);
		ArrayList<Integer>newOne = appendPosSum(list7);
		System.out.println(newOne);
	}
}
