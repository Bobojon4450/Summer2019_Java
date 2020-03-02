package zzz.interview_coding;

import java.util.ArrayList;
import java.util.Arrays;

public class OCA_Question_2_19 {
	
	/*
	 * public static void main(int[] args) { System.out.println("int main"); }
	 * 
	 * public static void main(double[] args) { System.out.println("double main"); }
	 * 
	 * public static void main(char[] args) { System.out.println("char main"); }
	 * 
	 * public static void main(String[] args) { System.out.println("String main"); }
	 */
	public static void main(String[] args) {

		String [][] chs = new String [2][];
		
		chs[0] = new String[2];	//assigns array of length 2 with null values
		chs[1] = new String[5]; //assigns array of length 5 with null values
		int i = 97;
		
		System.out.println(Arrays.toString(chs[0]));
		System.out.println(Arrays.toString(chs[1]));
		
		
		for (int j = 0; j < chs.length; j++) {
			for (int k = 0; k < chs.length; k++) {
				chs[j][k] = ""+i;//97
				i++;
			}
		}
		
		for (int j = 0; j < chs.length; j++) {
			for (int n = 0; n < chs[j].length; n++) {
				System.out.println(chs[j][n] + " ");
			}
		}
		
		
		int r = 0;
		int j = 7;
		//first iteration 7,6,5
		for (r = 0; r < j - 1; r = r + 2) {
			System.out.println(r+" ");//0,2,4
		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Rob");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if(names.remove("Bran")) {
			names.remove("John");
		}
		System.out.println(names);
	}
	
	
	

}
