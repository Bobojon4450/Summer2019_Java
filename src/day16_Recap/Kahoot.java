package day16_Recap;

public class Kahoot {
	public static void main(String[] args) {
		
		//Q#4
//		int batch = 12;
//		switch (batch) {
//			case 114:
//				System.out.print("Cyber");break;
//			case 12:
//				System.out.print(" Best");
//			default:
//				System.out.print(" Batch");
//		}
		
		//Q#8
		int x = 5, y =19;
		int num = y-x> x-y ? y-x : x-y;
		
		
		//Q#10
		boolean b = 13480.0 < 13480;// ==
		System.out.println(b);
		
		
		int i = 10;
		int j = 20;
		int k = j += i/5;//j = 20 + 10/5 = 20 + 2 = 22;	==> k=22, j=22;
		System.out.println(i+" "+k+" "+j);		//10 22 22
		
		
		
		
	}
}
