package practice_java;

public class StringPractice {

	public static void main(String[] args) {
		String str = "I love coding in java programming language";
		for (int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i) + "");
		}System.out.println("\n");
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb+"\n\n");
		System.out.println(startOz("zoo"));
	}
	
	/*	WarmUp-1 > startOz	*/
	public static String startOz(String str) {
		if (str.length() >= 2) {
			String temp = str.substring(0, 2);
			if (temp.contains("oz") || temp.contains("o") || temp.contains("z")) {
				if (temp.startsWith("oz")) {
					return temp.substring(0, 2);
				} else if (temp.substring(0, 1).equals("o")) {
					return temp.substring(0, 1);
				} else if (temp.substring(1, 2).equals("z")) {
					return temp.substring(1);
				} else {
					return "";
				}
			} else {
				return "";
			}
		} else {
			return str;
		}
	}

}
