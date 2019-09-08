package day9_ifelsea_statement;

public class QuizReview {

	public static void main(String[] args) {
		
		//Q#1
		boolean d = !!!!!false;
		System.out.println(d);
		
		boolean result = !false != ("Batch12" != "Best Batch ever");
		System.out.println(result);
		
		//Q#3
		int a = 100;
		double b = a += 100/20;
		//   	 100 += 5;     => 105;
		//example: x = x + (100/20); this is how compiler sees that.       
		System.out.println(a);
		
		
		//Q#5
		boolean e = 128 > '9';
		System.out.println("d = "+e);
		
		
		boolean c = 1 + 11 + "3" == "123";
		System.out.println(c);
		
		System.out.println((10 * 2)/(5 * 4) * 1000 / 10 % 100);
		System.out.println("--------------------------");
		
		System.out.println( 5 + 7 + "8" + 5 + 7);
		//					   12 + "8"
		//						128
		System.out.println( 5 + 7 + "8" + (5 + 7));
		
		System.out.println( 1 + 11 + "3" == "123");//true.
		
		String str = "cybertek";
		str = str + 2019 + true + 'a';
		System.out.println(str);
		System.out.println("--------------------------");
		
		int numA =100;
		numA += 300;//400
		System.out.println(numA++ +" "+ numA);
		//					400			401
		
		
		System.out.println('A' <= 'A');
		System.out.println('A' <= 'a');
		
		byte x = 10;
		int y = 10;
		System.out.println(x == y);//true. all the primitives are treated as values.
		
		
		
		
		
		
		
		
		
		
	}

}
