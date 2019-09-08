package day7_unary_shorthand;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = -10;
		
		System.out.println(b); 
		System.out.println("--------------------------");
		
		int num = 100;
		++num;//pre-increment
		System.out.println(num);
		System.out.println("--------------------------");
		
		int num2 = 50;
		System.out.println(num2++);//prints 50 and then increments
		System.out.println(num2);//prints incremented.
		
		int num3 = num2 ++;//assigns 51
		System.out.println(num3);
		System.out.println(num2);//incremented
		
		System.out.println("--------------------------");
		
		
		int num4 = 100;
		int num5 = num4++ -1;// assigns 99. 100 -1 = 99
		System.out.println(num5);
		System.out.println(num4);
		System.out.println("--------------------------");
		
		int num6 = 1;
		System.out.println(--num6);
		System.out.println(num6++);
		System.out.println(num6);
		System.out.println("--------------------------");
		
		int num7 = 50;//((49)+(49)) + ((50)+(49))
		num7 = --num7 + num7++ + num7-- + num7++;
		//       49     49       50       49
		System.out.println(num7);
		System.out.println("--------------------------");
		
		
		short num8 = 4;
		int num9 = num8 * 4 - num8--;
		System.out.println(num8);
		
		
		int w = 1;
		w = -w-- + w++ / -w-- * --w;
		//  post   post  post   pre
		//   -1  +  0  / -1  * -1
		//   -1  + (0/-1) * -1
		//   -1 -0 * -1
		//   -1 + 0
		//   -1
		System.out.println(w);
		System.out.println("--------------------------");
		
		
		int num10 = 50;
		num10 = --num10 + num10++ + num10-- + num10++;
				// 49   + 49      +  50     +  49     and then at the end increments by 1 and assigns to variable 
		System.out.println(num10);
		System.out.println("--------------------------");
		
		
		
		int num11 = 4;
		int num12 = num11 * 4 - num11++;
		System.out.println(num12);//12
		System.out.println(num11);//5
		System.out.println("--------------------------");
		
		
		
		
		
		
		
	}

}
