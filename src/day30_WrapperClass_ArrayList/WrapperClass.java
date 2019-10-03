package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {

	/*
    primitives                     wrapper-class : classes that are dedicated to primitives
      byte                            Byte            null
      short      Auto-boxing          Short           null
      int        ==========>           Integer         null
      long                            Long            null
      float                           Float           null
      double       un-boxing          Double          null
      boolean    <===========          Boolean         null
      char                            Character       null  
      
  
      default values of primitives:  
              byte, short, int, long ==>0;
              double, float ==> 0.0
              boolean ==> false
              char ==> space
      */
	
	public static void main(String[] args) {
		Character ch = 'A';
		System.out.println(ch);
		System.out.println(ch.charValue());
	
		long longnum = 10L;
		Long LongNum = longnum;//auto-boxing happening here. Primitive converted to wrapper class.
		longnum = LongNum; //wrapper to primitive: UNBOXING
		
		Boolean Bool = false;
		boolean bool = Bool; //Unboxing
		
		int[] arr = new int[3];	//default value is 0
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = new Integer[3];	//default value is null
		System.out.println(Arrays.toString(arr2));
		
		
		Boolean [] boo = new Boolean [2]; 
		System.out.println(Arrays.toString(boo)); //default value is null
		
		
		Double[] doub = new Double[3];	//default value is null
		System.out.println(Arrays.toString(doub));
		
		String[] str = new String[3];	//default value is null
		System.out.println(Arrays.toString(str));
		
		Character[] ch1 = new Character[3];	//default value is null
		System.out.println(Arrays.toString(ch1));
		
		
	}
}
