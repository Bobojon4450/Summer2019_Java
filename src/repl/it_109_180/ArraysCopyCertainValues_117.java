package repl.it_109_180;

import java.util.Arrays;

public class ArraysCopyCertainValues_117 {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"aa", "be", "lol", "lel", "oreo"};
	    System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {
	    int count = 0;
	    for(int i = 0; i < arr.length; i++){
	      if(arr[i].contains("e")){
	        count++;
	      }
	    }
	    
	    String fewValues [] = new String [count];
	    int eCount = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i].contains("e")){
	           fewValues[eCount] = arr[i];
	           eCount++;
	        }
	      } 
	    return fewValues;
	  }
}


