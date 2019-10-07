package repl.it_099_108;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_find_non_duplicate_114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int unique = 0;
		
		for (int i = 0; i < nums.length; i+=2) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					break;
				}else {
					unique = nums[i];
					System.out.println(unique);break;
				}
			}
		}
	}

	/*
	 * Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    String result = "";
    String t = "true";
    String f = "false";
		    for(int i =0;i<nums.length-1;i++){
		      if(nums[i]==5 && nums[i+1]==5){
		       result=t;
		       break;
		      }
		      else{
		        result=f;
		      }
		      
		    }  
		    System.out.println(result)
	 */
	
}
/*	1, 1, 2, 3, 3, 4, 4
 * 
 * if (unique !=(nums[i])) {
				unique = nums[i];
			}
 *
 * if (nums[i] == nums[i+1]) { continue; } else { System.out.print(nums[i]); }
 */