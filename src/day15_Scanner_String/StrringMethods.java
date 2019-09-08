package day15_Scanner_String;

public class StrringMethods {
	public static void main(String[] args) {
		
		String str = "Cybertek";
		System.out.println(str.charAt(0));//returns char at given index.
		
		String str2 = "Mu htar";
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.indexOf("r"));
		
		String name = "Donald J Trump";
		System.out.println(name.length());
		
		String str3 = "Cybertek";
		str3.concat(" School");
		System.out.println(str3);
		
		str3 = str3.concat(" School");
		System.out.println(str3);
		
		
		
		
	}
}
