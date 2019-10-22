package coding_Bat.WarmUp_1;

public class StringTraining {
	public static void main(String[] args) {
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		String str = new String("NewStr");
		System.out.println(str.compareToIgnoreCase(helloString));
	}
}

//	\0 this is how string ends.