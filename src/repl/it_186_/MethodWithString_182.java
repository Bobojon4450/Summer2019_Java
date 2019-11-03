package repl.it_186_;


public class MethodWithString_182 {
	
	public static void main(String[] args) {
		String str = "d5escri2ptio1n:";
		String result = extractNum(str);
		System.out.println(result);
	}
	
	public static String extractNum(String s) {
		char[] chars = s.toCharArray();
		String result ="";
		for (char each : chars) {
			if (Character.isDigit(each)) {
				result = result + each;
			}
		}
		return result;
	}
}
