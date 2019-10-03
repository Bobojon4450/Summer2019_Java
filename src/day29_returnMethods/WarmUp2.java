package day29_returnMethods;

public class WarmUp2 {

	public static void main(String[] args) {
		
		String str = "AABBCCDDDPP";// expected = "A2B2C2D3P2";
		String expectedResult = "";
		
		for (int j = 0; j < str.length(); ) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			expectedResult += "" + str.charAt(j) + count;
			str = str.replace("" + str.charAt(j), ""); //replace all str.charAt(j) chars. 
		}
		System.out.println(expectedResult);
		System.out.println(str);

	}

}

/*
 *	expectedResult += "" + str.charAt(j) + count;
			System.out.println(str.length());
			str = str.replace("" + str.charAt(j), ""); //replace all str.charAt(j) chars. 
			System.out.println(str);
			System.out.println(str.length()); 
 */
