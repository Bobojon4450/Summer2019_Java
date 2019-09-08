package day8_shorthandoperator;

public class ShortHand {

	public static void main(String[] args) {
		
		int a = 9;
			a += 3;
		System.out.println(a);
		
		int g =101;
		int h = g -= 1;//100
		System.out.println(h);
		
		int i = g += h + 5;//205
		//  i = 100 += 100 + 5;
		//  i = 100 += 105
		//  i = 100 + 105 = 205
		System.out.println("i = "+i);
		
		int j = h += g % i;//100
		//	j = 100 += 101 % 205
		//  j = 100 += 0;
		//  j = 100;
		System.out.println("j = "+j);
		
		int k = j -= h * 2 % 5;
		//    100 -= 100 * 2 % 5;
		//    100 -= 200 % 5 = 0;
		// 	  100 -= 0 = 100;
		System.out.println("k = "+k);
		
		System.out.println("------------------------------");
		
		int A = 100;
		A *= 200;// 20000
		System.out.println("A = "+ A);
		
		int B = 100;
		B *= 100 / 10;
		//100 *= 100 / 10 = 10
		// 100 *= 10 = 1000;
		System.out.println("B = "+B);
		
		B *= B -= 100;
		//1000 *= 1000 -= 100;
		System.out.println("B = "+B);
		System.out.println("-------------------------------");
		
		// Division
		int C = 1000;
		C /= 5;
		System.out.println("C1 = "+C);
		
		int D = 10;
//		C /= D - 10; can't be zero denominator
		//C = C / 10 -10;
		System.out.println(C);
		
		C /= D + 10; // 200 /= 10 + 10
		System.out.println("C2 = "+C);
		
		//%
		int z = 10 % 3;
		System.out.println(z);
		
		int E = 10;
		E %= 2; // E = 10 % 2 == 0
		System.out.println("E = "+E);
		
		int F =100;
		F %= 2; // 100 % 2 == 0
		System.out.println("F = "+F);
		
		System.out.println(-100 % 3);
		System.out.println(10.5 % 3);
		
		
		int J = 300;
		int K = 10;
		
		J += J %= K;// J = J + J % 10;
					// J = 300 + 0
					// J = 300;
		System.out.println("J = "+J);
		
		
		// addition first and then division
		int S = 200;
		int L = 10;
		S /= L + 10; // S = 200 / 10 + 10 
		System.out.println("S = " + S);
		
		
		
	}

}

