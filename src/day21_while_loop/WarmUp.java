package day21_while_loop;

public class WarmUp {

	public static void main(String[] args) {
		/*(int i = 0; i < sentence.length()-3; i++) --> we need subtract 3 from length in order to not get indexOutOfBound
		 * */
		
		String sentence= "I like books, I have books, I need book, I buy books, Dream books";
		int count =0;
		
		for (int i = 0; i < sentence.length()-3; i++) {
			if (sentence.substring(i, i+4).equals("book")) {
				count++;
			}
		}
		System.out.println(count);
		
		
/*******************************************************************/
//					   i   +  7+1 --> why 7+1? because last index is excluded.
		String words ="Cybertek is school, Cybertek is great, I love Cybertek";//length = 54; length - length of searching word
		int count2 = 0;
//		                       54  -  7 = 47
//		                    length - length of searching word
		for (int i = 0; i < words.length()-7; i++) {
//			                   54 ->61-7 ->(i+8) one less then this number
			if (words.substring(i, i+8).equals("Cybertek")) {//47 + 8 = 55; 55th index excluded.
//				                53  61
				count2++;
			}
		}
		System.out.println(count2);
		
		
/*******************************************************************/
		/*
	     write a java program that can remove duplicated values from String
	        EX:
	            input: aabbcc
	            output: abc
	     */
	    
	        String s1 = "aabbcc";
	        //           i
	        //   a:  (0, 1)  
	        //     (i, 1+1)
	        String result = "";  //abc  // to store the new String value that does not have duplicates
	        
	        for(int i=0; i < s1.length(); i++) {
	            if(! result.contains( s1.substring(i, i+1) )) {
	                result += s1.substring(i, i+1);
	            }
	        }
	        System.out.println(result);
	        
	        /**same task with the different approach.
	         * 
	         * for(int i=0; i < s1.length(); i++) {
	            if(! result.contains( s1.charAt(i)+"")) {
	                result += s1.substring(i, i+1);
	            }
	        } 
	         * */
		
	}

}
