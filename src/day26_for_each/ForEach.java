package day26_for_each;

public class ForEach {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n----------------");
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n----------------");
		
		String str [] = {"A","B","C","D"}; 
		for (String s : str) {
			System.out.print(s+" ");
		}
		System.out.println("\n----------------");
		
		
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        
        for( int  varname : arr1 ) {
            if( varname %2 == 0)
                System.out.print( varname +" ");
        }
        System.out.println("\n----------------");
		
         
        for( int  varname : arr1 ) {
            if( varname %2 != 0)
                System.out.print( varname +" ");
        }
        System.out.println("\n----------------");
        
     // print out 1 ~ 1000  :  we cannot use for each loop
	}
}
