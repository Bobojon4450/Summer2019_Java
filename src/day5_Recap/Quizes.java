package day5_Recap;

public class Quizes {

	public static void main(String[] args) {
//		int 7num =10; cant start with numbers
		
		double num =10L;
		double num2 = 5.5F;
		
		float num3 = 10;	// compiles because float > byte, short, int, long
		float num4 = 5.5F;	//must provide "F" otherwise 5.5 will be treated as double by compiler
		
		float num5 = 10;
		float num6 = 10f;
		
		int _bla = 10;
		int $bla = 10;
//		int %bla = 10; does Not compile.
//		int 3bla = 10; does Not compile.
//		int bla#3 = 10; does Not compile.
		int last$name = 10;
		int last_$name =10;
		
		char ch = 's';
		int num7 = ch;
		/****************************************************************/
		
		int num8 = 'B';
		System.out.println(num8);//66
		
		float fnum = 'B';
		System.out.println(fnum);//66.0
		
		byte bnum = 'B';
		System.out.println(bnum);//66
		
		float Fnum = 5.0F;
		float Fnum2 = 5;
		System.out.println(Fnum);//5.0
		System.out.println(Fnum2);//5.0
		
		
		char specChar = 55000;
		System.out.println(specChar);//?
		
		
		//practices
		char ch1 = 35;//#
		char ch2 = '#';
		System.out.println(ch1);
		System.out.println(ch2);
		
		short sh1 = 35;
		byte b1 = 35;
		int i1 = 35;
		long l1 = 35;
		float f1 = 35;
		double d1 = 35;
		
		System.out.println(sh1);
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1+"\n");
		
		char ch3 = '#';
		System.out.println(ch2);
		
		
		

	}

}
