package day24_JavaRecap;

public class WarmUp3 {

	public static void main(String[] args) {
		
		String[] MyNumbers = new  String[5];
        for(int i=0; i <  MyNumbers.length; i++  ) {
            System.out.print( MyNumbers[i]+" " );
        }
        System.out.println("    \n");
        /*
         default values:
            int, byte, short, long ==> 0
            double & float ==> 0.0
            boolean ==> false
            char ==> space
            
            String ==> null
         */
        
        
        int[] ch = new int[3];
        ch[0] = 97;
        ch[1] = 20;
        ch[2] = 30;
        for (int i : ch) {
			System.out.print(i+" ");
		}
        System.out.println("    \n");
        
        
		int [] arr = {1,2,3};
		int [] arr2 = {4,5,6,7};
		int []arr3 = new int[arr.length+arr2.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		
//		for (int i = arr2.length; i < arr2.length+arr.length; i++) {
//			arr3[i]=arr2[i-arr2.length];
//		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i+arr.length] = arr2[i];
		}
		
		for (int i : arr3) {
			System.out.print(i);
		}
	}
}
